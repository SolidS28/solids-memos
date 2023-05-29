package com.solids.springdemokotlin.dtos

import org.springframework.beans.BeanUtils

// Any more detailed and customized converter should be here
// There are ways to "force" it such as adding an interface as metadata to implement it ex "convertible"
// But I think it could be messy and meaningless because it doesn't add value being an empty interface
// Other way is to add and converter class for each pair and implement the default function as this but is just more code no real value added
// Or just map source target in a service class "converterService" but it's getting more complex when almost most of the cases fall into default
// Finally it could be considered to create a "link" between entity and dto but that's what I want to decouple, they should not be coupled
// TL;DR services could find the converters here, it's not forced as a high-level function step but just as an implicit step

inline fun<reified T: Any> convert(source: Any): T {
    val target = BeanUtils.instantiateClass(T::class.java)
    BeanUtils.copyProperties(source, target)
    return target
}
