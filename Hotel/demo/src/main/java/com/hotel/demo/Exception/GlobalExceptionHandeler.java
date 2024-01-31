package com.hotel.demo.Exception;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.weaver.ast.Expr;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandeler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String,Object>> ResourceNotFoundException(){


        Map map=new HashMap();
       // map.put("message",ex.getMessage());
        map.put("status",false);
        map.put("Status", HttpStatus.NOT_FOUND);
        
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);

    }

}
