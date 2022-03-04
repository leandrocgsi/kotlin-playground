package br.com.erudio.section07._0708

interface Matcher<T> {
    fun test(lhs: T): Unit

    infix fun or(other: Matcher<T>): Matcher<T> = object : Matcher<T>{
        override fun test(lhs: T) {
            try {
                this@Matcher.test(lhs)
            } catch (e: RuntimeException) {
                other.test(lhs)
            }
        }
    }

    infix fun <T>T.should(matcher: Matcher<T>) {
        matcher.test(this)
    }

    infix fun <T> Collection<T>.should(fn: CollectionMatcher<T>.() -> Unit) {
        val matchers = CollectionMatcher(this)
        matchers.fn()
    }


}

fun unitTest() {
    val listOfMonths = listOf("December", "January", "February", "March")
    //listOfMonths should { notContain("Foo Bar")}
}