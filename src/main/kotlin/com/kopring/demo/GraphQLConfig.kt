package com.kopring.demo

import graphql.scalars.ExtendedScalars
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.graphql.execution.RuntimeWiringConfigurer

@Configuration
class GraphQLConfig {

    @Bean
    fun registerScalarType(): RuntimeWiringConfigurer {
        return RuntimeWiringConfigurer { builder -> builder.scalar(ExtendedScalars.GraphQLLong) }
    }
}
