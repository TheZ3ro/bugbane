package org.osservatorionessuno.bugbane.qf.modules

import android.content.Context
import io.github.muntashirakon.adb.AbsAdbConnectionManager
import org.osservatorionessuno.bugbane.qf.Module
import org.osservatorionessuno.bugbane.qf.Shell
import java.io.File

/**
 * Sample module that runs `dumpsys` and stores the output.
 */
class Dumpsys : Module {
    override val name: String = "dumpsys"

    override fun run(context: Context, manager: AbsAdbConnectionManager, outDir: File) {
        val shell = Shell(manager)
        shell.execToFile("dumpsys", File(outDir, "dumpsys.txt"))
    }
}