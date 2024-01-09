package com.kopring.demo

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean
import graphql.scalars.ExtendedScalars
import graphql.schema.GraphQLScalarType
import graphql.schema.Coercing
import org.springframework.graphql.execution.RuntimeWiringConfigurer

@Configuration
class GraphQLConfig {

    @Bean
    fun registerScalarType(): RuntimeWiringConfigurer {
        return RuntimeWiringConfigurer { builder ->
            builder.scalar(ExtendedScalars.GraphQLLong)
        }
    }
}