#makefile for Time class with three files:
# Time.h, Time.cpp, Driver.cpp

a.out: Driver.o Time.o
	g++ -o fabo Driver.o Time.o

Driver.o: Driver.cpp Time.h
	g++ -c Driver.cpp

Time.o: Time.cpp Time.h
	g++ -c Time.cpp
