package org.kartonix

import java.awt.*
import javax.swing.*

var a = JTextArea("|ДОБРО ПОЖАЛОВАТЬ В KARTONIX 3\n|")
var f = JFrame("Kartonix III");

fun createTerminal() {
    f.setSize(800, 500)
    f.setLocationRelativeTo(null)
    f.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    f.background = Color.BLACK
    val font = Font("LUCIDA CONSOLE",Font.PLAIN,13)

    val p = JScrollPane(a)
    f.add(p)
    p.isVisible = true
    a.background = Color.BLACK
    a.foreground = Color.GREEN
    a.font = font
    a.caretColor = Color.WHITE
    a.caretPosition = a.text.length
}