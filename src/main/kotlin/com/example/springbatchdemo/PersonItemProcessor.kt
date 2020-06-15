package com.example.springbatchdemo

import com.example.batchprocessing.Person
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

class PersonItemProcessor: ItemProcessor<Person, Person> {

    companion object {
        private val log: Logger = LoggerFactory.getLogger(PersonItemProcessor.javaClass)
    }

    override fun process(person: Person): Person {
        val firstName: String = person.firstName.toUpperCase()
        val lastName: String = person.lastName.toUpperCase()
        val transformedPerson = Person(firstName, lastName)

        log.info("Converting ($person) into ($transformedPerson)")
        return transformedPerson
    }
}