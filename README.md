# SampleSpringBootApplication

# Accessing application.properties file in spring boot
	@Autowired
	Environment env --> This can be used to fetch the values in the application.properties file and then the same can be used in the application. 

	@Value is another annotation that can be used to fetch the value from the application.properties file and inject the same to the instance variable. 