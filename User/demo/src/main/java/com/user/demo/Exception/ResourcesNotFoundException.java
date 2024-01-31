package com.user.demo.Exception;

public class ResourcesNotFoundException extends RuntimeException {



    public ResourcesNotFoundException()
    {
        super("Resource NOt fond on Server:!!");
    }

    public ResourcesNotFoundException(String message)
    {
        super(message);
    }

}
