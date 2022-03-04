package br.com.erudio.section07._0708

class CollectionMatcher<T> (val collection: Collection<T>) {

    fun contains(rhs: T): Unit {
        if (!collection.contains(rhs))
            throw RuntimeException("Collection did not contain $rhs")
    }

    fun notContains(rhs: T): Unit {
        if (collection.contains(rhs))
            throw RuntimeException("Collection should not contain $rhs")
    }

    fun haveSize(size: Int): Unit {
        if (collection.size >= size)
            throw RuntimeException("Collection should have size less than $size")
    }
}