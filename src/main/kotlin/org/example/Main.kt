package org.example

class Main {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val host = "imap.gmail.com"
            val port = "993"
            val login = ""
            val password = ""
            val meetingManager = MeetingManager()
            val meetings = meetingManager.getMeetingsFromMailbox(host, port, login, password)
            meetings.forEach{
                print("начало встречи: ")
                print(it.startTime)
                print(", конец встречи: ")
                print(it.endTime)
                println()
                print("***")
                println()
            }
        }
    }
}