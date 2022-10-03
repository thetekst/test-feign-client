# test-feign-client
fix error: "Caused by: feign.RetryableException: Invalid HTTP method: PATCH executing PATCH" https://stackoverflow.com/a/63580015

org.springframework.boot 2.5.13
DefaultHandlerExceptionResolver : Resolved [org.springframework.web.HttpRequestMethodNotSupportedException: Request method 'GET' not supported]

Invocation of init method failed; nested exception is feign.RetryableException: Invalid HTTP method: PATCH
