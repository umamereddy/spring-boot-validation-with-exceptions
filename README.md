# spring-boot-validation-with-exceptions

This project has spring boot rest api validation + exception handler.

When any API throws an exception create an related custome exception class and throw it, 
1) Creata an custom exception class in exception package.
2) create an @RestControllerAdvice class to map the customException class with @ExecptionHandler and print the exceptions.
