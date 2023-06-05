package com.example.quizking
object SetData {
    fun getQuestion():ArrayList<QuestionData>{
        var Que:ArrayList<QuestionData> = arrayListOf()
        var q1=QuestionData(
            "what is capital of India?",
            1,
              "New Delhi",
            "Lucknow",
            "Mumbai",
            "Kolkata",
            1

        )
        var q2=QuestionData(
            "The World Largest desert is ?",
            2,
            "Thar",
            "Kalahari",
            "Sahara",
            "Sonoran ",
            3

        )
        var q3=QuestionData(
            "Country that has the highest in Barley Production ?",
            3,
            "China",
            "India",
            "Russia",
            "France",
            3

        )
        var q4=QuestionData(
            "The metal whose salts are sensitive to light is ?",
            4,
            "Zinc",
            "Silver",
            "Copper",
            "Aluminium",
            2

        )
        var q5=QuestionData(
            "The Central Rice Research Station is situated in ?",
            5,
            "Chennai",
            "Cuttak",
            "Bangalore",
            "Quilon",
            2

        )
        Que.add(q1)
        Que.add(q2)
        Que.add(q3)
        Que.add(q4)
        Que.add(q5)
        return Que



    }
}