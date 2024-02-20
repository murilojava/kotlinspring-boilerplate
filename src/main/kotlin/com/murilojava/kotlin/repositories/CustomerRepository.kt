
package com.murilojava.kotlin.repositories

import com.murilojava.kotlin.documents.Customer

import org.springframework.data.mongodb.repository.MongoRepository

interface CustomerRepository : MongoRepository<Customer, String> 
// {
    
//     @Query("{name:'?0'}")
//     GroceryItem findItemByName(String name);
    
//     @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
//     List<GroceryItem> findAll(String category);
    
//     public long count();

// }