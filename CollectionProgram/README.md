Program to Person class has the following properties:-

Person(Integer id, String name, Float salary)

Create a PersonService class:-

a) List<Person> generateList() - This method should create a list of Person objects. Use any arbitrary data.

b) Map<Float, Person> transform(List<Person> people) - This method takes as input the List<Person> in the previous step and converts it to a Map
	<Integer, Person>. 

The key (integer) should be the Person.id. If two or more Person objects in the List<Person> has duplicate ids, then before Inserting in the Map, then append one on the decimal side.

e.g.
PersonA - 1, ankur, 20000 : Map<1, Person(1, ankur, 20000)>
PersonB - 1, ravi, 30000 : Map<1.1, Person<1, ravi, 30000)>
PersonC - 1, prem, 50000: Map<1.11, Person,1,50000>

c) show(List<Person>) - prints the Person list on the console in readable format.
	
d) show(Map<Float, Person> - prints the Person map on the console in readable format.