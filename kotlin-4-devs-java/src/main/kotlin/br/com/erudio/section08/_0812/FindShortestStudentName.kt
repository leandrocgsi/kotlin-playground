package br.com.erudio.section08._0812

fun findTheShortestStudentName(students: List<Student>): Student? {
    return students.minByOrNull { it.name.length }
}