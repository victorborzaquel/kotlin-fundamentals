package examples.generics

fun <T: Comparable<T>> max(p1: T, p2: T) = if (p1 > p2) p1 else p2