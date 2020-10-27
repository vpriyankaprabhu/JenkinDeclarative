package com.oracle.jenkintest.jenkinfiledemo.Controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableAsync
public class ThreadConfig extends ThreadPoolTaskExecutor
{

Executors ex = ThreadPoolTaskExecutor()

}

//save --details catch--rollback
@autowired
jpaservice jpa

    @Transaction(Rollbackfor=datanotfound.class)
public void savedetails(Employee e)
{
    try
    {
        jpa.save(e);
    }
    catch (Datanotfound e)
    {

    }




}


//employee and department left join

interface  employee extends Crudrepository<Employee,Long>
{

    @Query(native=true,value="select name from employee where left join on employee.id ==Department.Id ")
    Optional<List<Employee>> getemployee();

}