# SpringBootCore






07- 
@Primary
It tells Spring, "when you find more than one beans that both can be autowired, please use the primary one as your first choose." So, Spring will pick bean1 to autowire to BeanService


08- 
@Qualifier will tell Spring, "no matter how many beans you've found, just use the one I tell you."

Note : It's worth noting that if both the @Qualifier and @Primary annotations are present, then the @Qualifier annotation will have precedence. Basically, @Primary defines a default, while @Qualifier is very specific.
