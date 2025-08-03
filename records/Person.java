package records;
//Para trabalhar com objetos imutáveis, é necessário usar o pacote records
//O records só trabalha com propriedades estaticas
// ou seja, não é possível criar objetos mutáveis com o records
// O records é uma forma de criar classes de forma mais simples e rápida

public record Person(String name, int age) {
}
