package org.kartonix

import java.awt.Color
import java.awt.*
import java.awt.event.*
import org.kartonix.f

fun main() {
    var pass: String = "<отсутствует>"
    createTerminal()
    f.isVisible = true




    var aq = 1
    while (aq>0) {
        var prompt = a.text
        if (prompt.endsWith("\n")) {

            if (prompt.endsWith("|ДОБРО ПОЖАЛОВАТЬ В KARTONIX 3\n|")) {

            } else if (prompt.endsWith("|bebra\n")) {
                a.text = "${a.text}|бебра\n|"
            } else if (prompt.endsWith("|info\n")) {
                a.text = "${a.text}|версия терминала: 3.1|версия ядра: 3.6\n|"
            } else if (prompt.endsWith("|?\n")||prompt.endsWith("|help\n")) {
                a.text = "${a.text}|список команд терминала kartonix:\n|1. info - информация о установленной системе\n|2. help - список доступных команд и инструкции к терминалу kartonix\n|3. user - имя и пароль активного на данный момент пользователя\n|4. shutdown - закрытие терминала\n|5. clear - очистить весь терминал\n|6. color 1/2 - поменять цвет текста на белый/зеленый\n|Инструкции:\n|удаляйте прошлый вывод только с помощью команды clear иначе он перестанет функционировать\n|"
            } else if (prompt.endsWith("|user\n")) {
                a.text = "${a.text}|текущий пользователь: administrator\n|пароль: $pass\n|"
            } else if (prompt.endsWith("|shutdown\n")||prompt.endsWith("|exit\n")) {
                System.exit(0)
            } else if (prompt.endsWith("|clear\n")) {
                a.text = "|терминал был очищен\n|"
            } else if (prompt.endsWith("|color 1\n")) {
                a.foreground = Color.WHITE
                a.text = "${a.text}|"
            } else if (prompt.endsWith("|set password\n")) {
                a.text = "${a.text}|\n|"
            } else if (prompt.endsWith("|color 2\n")) {
                a.foreground = Color.GREEN
                a.text = "${a.text}|"
            } else if (prompt.endsWith("|\n")) {
                a.text = "${a.text}|\n|"
            } else if (prompt.endsWith("|\n")) {
                a.text = "${a.text}|\n|"
            }

            else {
                a.text = "${a.text}|"
                a.caretPosition = a.text.length
                continue
            }

            a.caretPosition = a.text.length
        }




    }
}