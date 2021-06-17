# Spring-Rest-Practice
This is a demo app for practicing Spring Rest.

---

### HTTP Request Overview

- Request/response message has three main parts:

- 

### POJO converting to JSON

- 

### PathVariable for REST

-  Retrieve a some information with some parameters(Append as path variable). Or transfer some configurations setting or customized parameters that users would like.

-  Make use of @PathVariable.

### Exception Handling

- Development Process: 1. Create custom error response class. 2. Create custom student exception. 3. Update REST service to throw exception. 4. Add exception handler method(@ExceptionHandler) and return a ResponseEntity.

- Spring @ControllerAdvice: similar to an interceptor / filter, pre-process requests and post-process responses, and perfect for global exception handling. (Real-time use of AOP)

