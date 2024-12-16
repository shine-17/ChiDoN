
함께 모으기

객체지향 설계 안에 존재하는 세 가지 상호 연관된 관점이 있다.
 
[개념 관점]
설계 : 도메인 안에 존재하는 개념돠 개념들 사이의 관계를 표현한다.
도메인 : 사용자들이 관심을 가지고 있는 특정 분야나 주제를 말한다.
소프트웨어 : 도메인에 존재하는 문제를 해결하기 위해 개발

개념 관점 : 사용자가 도메인을 바라보는 관점을 반영한다. 따라서 실제 도메인의 규칙과 제약을 최대한 유사하게 반영하는게 핵심이다.

[명세 관점]
명세 관점에서부터는 사용자의 영역인 도메인을 벗어나 개발자의 영역인 소프트웨어로 초점이 옮겨진다.

도메인의 개념이 아니라 실제로 소프트웨어 안의 객체들의 책임에 초점을 맞춘다. 즉, 객체의 인터페이스를 바라본다.

명세 관점에서 프로그래머는 객체가 협력을 위해 '무엇'을 할 수 있는가에 초점을 맞춘다.

또한 인터페이스와 구현을 클래스 안으로 섞어버리지 않고 인터페이스와 구현을 분리하는게 훌륭한 객체지향의 설계이다.

즉, 명세 관점과 구현 관점을 명확하게 분리해야함.

ex)
명세 관점 : UserRepository
구현 관점 : UserRepositoryImpl

[구현 관점]
객체들의 책임을 수행하는 데 필요한 동작하는 코드를 작성

[커피세상]
손님 객체는 '손님 타입의' 인스턴스
바리스타 객체는 '바리스타 타입'의 인스턴스
아메리카노 커피, 카푸치노 커피 객체는 '커피 타입'의 인스턴스
아메리카노, 카푸치노는 '메뉴 항목 타입'의 인스턴스

[포함 관계]
메뉴판과 메뉴 항목 : 메뉴 항목은 메뉴판에 포함됨

[연관 관계]
손님과 메뉴판 : 손님은 메뉴판 타입을 알아야 커피 선택 가능
바리스타와 커피 : 바리스타는 커피를 알아야 제조 가능

이러한 도메인 모델을 만들 수 있다.


[설계하고 구현하기]
객체지향 설계 목표 첫 번째는 훌륭한 객체를 설계하는게 아니라 훌륭한 협력을 설계해야됨.

협력을 설계할 때는 객체가 메시지를 선택하는 것이 아니라 메시지가 객체를 선택하게 해야 됨.

* 객체가 메시지를 선택하는 경우. 
class Customer {
    fun orderCoffee(megaCoffee: MegaCoffee, coffeeType: String) {

    val megaCoffee = if (coffeeType == "Espresso") {
        megaCoffee.makeEspressoCoffee()
    } else {
        megaCoffee.makeLatteCoffee()
    }
    println("Ordered a ${coffee.type}")
    }
}

class MegaCoffee {
    fun makeEspressoCoffee(): coffee = Coffee("Espresso")
    fun makeLatteCoffee(): coffee = Coffee("Latte")
}

data class Coffee(val type: String)

-> 문제점 
1. Customer 객체가 MegaCoffee의 내부 구현을 알고 있다.
2. 커피 종류에 따라 어떤 메서드를 호출할지 Customer가 결정함.
3. 새로운 커피 종류가 추가되면 Customer의 코드도 변경해야함.


* 메시지가 객체를 선택하는 경우. 
class Customer {
fun orderCoffee(megaCoffee: MegaCoffee, coffeeType: String) {
    val coffee = megaCoffee.makeCoffee(coffeeType)
    println("Ordered a ${coffee.type}")
    }
}

class MegaCoffee {
    fun makeCoffee(coffeeType: String): coffee {
        return when (coffeeType) {
            "Espresso" -> coffee("Espresso")
            "Latte" -> coffee("Latte")
        else -> println("Coffee type error !")
        }
    }
}

data class Coffee(val type: String)

1. 메시지(makeCoffee)가 주도적으로 동작.
2. "커피를 만들어라"는 메시지가 MegaCoffee를 선택함.
3. Customer는 커피를 주문한다는 협력을 정의할 뿐, 커피를 만드는 세부 사항은 MegaCoffee의 책임이다.
4. 새로운 커피 종류가 추가되면 MegaCoffee만 수정하면 됨. Customer는 수정할 필요가 없다.

[코드와 세 가지 관점]
위에서 말한 개념, 명세, 구현 관점을 기준으로 나눠보면

* 개념 관점 : 손님 (Customer) 이  커피 매장 (MegaCoffee) 에서 커피를 주문할 때, 각각의 개념들이 협력해서 커피를 주문 받고 커피를 만들고 제공한다.
* 명세 관점 : 인터페이스
ex) interface CoffeeMaker { 
        fun makeCoffee(coffeeType: String)
    }
* 
class coffee : CoffeeMaker{
   override fun makeCoffee(coffeeType: String)
} 

class b() {
    coffee.
}

* 구현 관점 : MegaCoffee 클래스의 makeCoffee

[도메인 개념을 참조하는 이유]
도메인 개념 안에서 적절한 객체를 선택하여 도메인에 대한 지식을 기반으로 코드의 구조와 의미를 쉽게 유추한다.