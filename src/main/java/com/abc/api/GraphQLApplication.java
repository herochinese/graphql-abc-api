package com.abc.api;

import com.abc.api.resolvers.Mutation;
import com.abc.api.resolvers.Query;
import com.coxautodev.graphql.tools.SchemaParser;
import graphql.execution.AsyncExecutionStrategy;
import graphql.execution.ExecutionStrategy;
import graphql.schema.GraphQLSchema;
import graphql.servlet.GraphQLServlet;
import graphql.servlet.SimpleGraphQLServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphQLApplication {

    @Autowired
    private Query query;

    @Autowired
    private Mutation mutation;

    public static void main(String[] args) {
        SpringApplication.run(GraphQLApplication.class, args);

    }



    @Bean
    public ServletRegistrationBean servletRegistrationBean() {

        GraphQLSchema schema  = SchemaParser.newParser().resolvers(query,mutation).file("xabc-api-shema.graphqls").build().makeExecutableSchema();
        ExecutionStrategy executionStrategy = new AsyncExecutionStrategy();
        GraphQLServlet servlet = new SimpleGraphQLServlet(schema, executionStrategy);
        ServletRegistrationBean bean = new ServletRegistrationBean(servlet, "/graphql");
        return bean;
    }
}
