package com.example.assigmentlab06

data class MP(
    val name: String,
    val constituency: String,
    val party: String,
    val imageUrl: String
)

val mpList = listOf(
    MP("John Doe", "Constituency A", "Party X", "https://via.placeholder.com/150"),
    MP("Jane Smith", "Constituency B", "Party Y", "https://via.placeholder.com/150"),
    MP("Alice Johnson", "Constituency C", "Party Z", "https://via.placeholder.com/150")
)