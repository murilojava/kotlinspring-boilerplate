
package com.murilojava.kotlin.documents

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("customers")
data class Customer(@Id var id: String?, var name: String, var age: Int, var email: String, var socialId: String)