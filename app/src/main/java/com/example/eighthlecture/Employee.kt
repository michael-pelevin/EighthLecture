package com.example.eighthlecture

data class Employee(
    val id: Long,
    val fullName: String,
    val photoUrl: String,
    val department: String,
    var isFavourite: Boolean
) {
    companion object {
        fun getMockEmployees() = listOf(
            Employee(
                0,
                "Dwayne Johnson",
                "https://commons.wikimedia.org/wiki/File:Dwayne_Johnson_2,_2013.jpg?uselang=ru",
                "Fitness Dept", true
            ),
            Employee(
                0,
                "Dwayne Johnson 1",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.themoviedb.org%2Fperson%2F18918-dwayne-johnson%3Flanguage%3Dru-RU&psig=AOvVaw0KzeY4QdwOtMK0rqEV0Qzc&ust=1650958006215000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCPiBgP7XrvcCFQAAAAAdAAAAABAD",
                "Fitness Dept", false
            ),
            Employee(
                1,
                "Dwayne Johnson 2",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.themoviedb.org%2Fperson%2F18918-dwayne-johnson%3Flanguage%3Dru-RU&psig=AOvVaw0KzeY4QdwOtMK0rqEV0Qzc&ust=1650958006215000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCPiBgP7XrvcCFQAAAAAdAAAAABAD",
                "Fitness Dept", false
            ),
            Employee(
                2,
                "Dwayne Johnson 3",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.themoviedb.org%2Fperson%2F18918-dwayne-johnson%3Flanguage%3Dru-RU&psig=AOvVaw0KzeY4QdwOtMK0rqEV0Qzc&ust=1650958006215000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCPiBgP7XrvcCFQAAAAAdAAAAABAD",
                "Fitness Dept", false
            ),
            Employee(
                3,
                "Dwayne Johnson 4",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.themoviedb.org%2Fperson%2F18918-dwayne-johnson%3Flanguage%3Dru-RU&psig=AOvVaw0KzeY4QdwOtMK0rqEV0Qzc&ust=1650958006215000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCPiBgP7XrvcCFQAAAAAdAAAAABAD",
                "Fitness Dept", false
            ),
            Employee(
                4,
                "Dwayne Johnson 5",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.themoviedb.org%2Fperson%2F18918-dwayne-johnson%3Flanguage%3Dru-RU&psig=AOvVaw0KzeY4QdwOtMK0rqEV0Qzc&ust=1650958006215000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCPiBgP7XrvcCFQAAAAAdAAAAABAD",
                "Fitness Dept", false
            ),
            Employee(
                5,
                "Dwayne Johnson 6",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.themoviedb.org%2Fperson%2F18918-dwayne-johnson%3Flanguage%3Dru-RU&psig=AOvVaw0KzeY4QdwOtMK0rqEV0Qzc&ust=1650958006215000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCPiBgP7XrvcCFQAAAAAdAAAAABAD",
                "Fitness Dept", false
            ),
            Employee(
                6,
                "Dwayne Johnson 7",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.themoviedb.org%2Fperson%2F18918-dwayne-johnson%3Flanguage%3Dru-RU&psig=AOvVaw0KzeY4QdwOtMK0rqEV0Qzc&ust=1650958006215000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCPiBgP7XrvcCFQAAAAAdAAAAABAD",
                "Fitness Dept", false
            ),
            Employee(
                7,
                "Dwayne Johnson 8",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.themoviedb.org%2Fperson%2F18918-dwayne-johnson%3Flanguage%3Dru-RU&psig=AOvVaw0KzeY4QdwOtMK0rqEV0Qzc&ust=1650958006215000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCPiBgP7XrvcCFQAAAAAdAAAAABAD",
                "Fitness Dept", false
            )

        )
    }
}