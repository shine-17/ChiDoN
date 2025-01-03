# 03. 타입과 추상화

### 추상화를 통한 복잡성 극복

<img src="../images/ch03_1.png">

해리 벡의 지하철 노선도는 불필요한 지형 정보를 제거함으로써 단순함을 달성한 추상화의 훌륭한 예다. 해리 벡이 고안한 추상화는 지형 정보를 제거하고 **역 사이의 연결성을 강조함으로써 지하철 노선도를 이용하는 승객들의 목적에 맞게 현실을 단순화**했다.

이 추상화가 유용했던 이유는 승객들이 지하철을 바라보는 모델과 일치했기 때문이다. 승객들이 지하철을 이용하는 이유와 해리 벡이 지형 정보를 제거한 이유는 동일하다. 역의 위치가 중요한 것이 아니라 **역과 역 사이의 연결 관계가 중요**했던 것이다.

진정한 의미에서 추상화란 현실에서 출발하되 불필요한 부분을 도려내가면서 사물의 본질을 드러나게 하는 과정이라고 할 수 있다. 추상화의 목적은 불필요한 부분을 무시함으로써 현실에 존재하는 복잡성을 극복하는 것이다. 해리 벡의 지하철 노선도를 통해 알 수 있는 것처럼 훌륭한 추상화는 목적에 부합하는 것이어야 한다.

>
>**추상화**
>
>어떤 양상, 세부 사항, 구조를 좀 더 명확하게 이해하기 위해 특정 절차나 물체를 의도적으로 생략하거나 감춤으로써 복잡도를 극복하는 방법
>
>복잡성을 다루기 위해 추상화는 두 차원에서 이뤄진다.
>- **첫번쨰 차원**은 구체적인 사물들 간의 공통점은 취하고 차이점은 버리는 일반화를 통해 단순하게 만드는 것이다.
>- **두 번째 차원**은 중요한 부분을 강조하기 위해 불필요한 세부 사항을 제거함으로써 단순하게 만드는 것이다.
>
>모든 경우에 추상화의 목적은 복잡성을 이해하기 쉬운 수준으로 단순화하는 것
> 

앨리스의 이야기에 등장하는 정원사, 병사, 신하, 왕자와 공주, 하객으로 참석한 왕과 왕비들, 하트 잭, 하트 왕과 하트 여왕 모두를 간단히 **트럼프** 라고 할 수 있다. 이 다양한 인물들을 계급, 나이, 성격 등의 차이점은 무시한 채 **트럼프** 라는 유사성를 기반으로 추상화했기 때문이다.

## 개념

앨리스가 **기껏해야 트럼프에 불과해** 라고 말한 건 정원에 있는 인물들을 **트럼프**와 **토끼**라는 두 개의 그룹으로 나눌 수 있다는 것이다. 앨리스는 정원 안에 도열해 있던 다양한 인물들의 복잡다단한 면을 깔끔하게 추상화한 것이다.

객체지향 패러다임의 중심에는 구체적이고 실제적인 객체가 존재하지만 수많은 객체들을 개별적인 단위로 취급하기에는 인간이 지닌 인지능력은 턱없이 부족하다. 따라서 사람들은 본능적으로 공통적인 특성을 기준으로 객체를 여러 그룹으로 묶어 동시에 다뤄야 하는 가짓수를 줄임으로써 상황을 단순화하려고 노력한다.

이처럼 공통점을 기반으로 객체들을 묶기 위한 그릇을 **개념(concept)** 이라고 한다. 개념이란 일반적으로 우리가 인식하고 있는 다양한 사물이나 객체에 적용할 수 있는 아이디어나 관념을 뜻한다.

앨리스 이야기에서 정원에 있는 모든 인물들은 전부 객체다. 그리고 앨리스는 이 객체들 중에서 몸이 납작하고 두 손과 두 발이 네모난 몸 모서리에 달려 있는 객체만을 **트럼프** 라는 개념으로 추상화했다. 여기서 트럼프는 이 같은 공통점을 가진 객체들을 포괄할 수 있는 개념이다.

<img src="../images/ch03_2.png">

개념을 이용하면 객체를 여러 그룹으로 **분류(classification)**할 수 있다. 앨리스가 정원에 있는 객체를 **트럼프**와 **토끼**라는 두 개의 개념으로 나누고 두 개념에 적합한 객체가 각 그룹에 포함되도록 분류했다. 결과적으로 **개념은 공통점을 기반으로 객체를 분류할 수 있는** 일종의 체라고 할 수 있다.

결국 각 객체는 특정한 개념을 표현하는 그룹의 일원으로 포함된다. 하트 여왕은 **트럼프** 라는 개념 그룹의 일원이고, 하얀 토끼는 **토끼** 라는 개념 그룹의 일원이다. 이처럼 객체에 어떤 개념을 적용하는 것이 가능해서 개념 그룹의 일원이 될 때 객체를 그 개념의 **인스턴스(instance)** 라고 한다.

> **인스턴스(instance)**
객체란 특정한 개념을 적용할 수 있는 구체적인 사물을 의미한다. 개념이 객체에 적용됐을 때 객체를 개념의 인스턴스라고 한다.
> 

### 개념의 세 가지 관점

일반적으로 객체의 분류 장치로서 개념을 이야기할 때는 아래의 세 가지 관점을 함께 언급한다.

- **심볼(symbol)** : 개념을 가리키는 간략한 이름이나 명칭
- **내연(intension)** : 개념의 완전한 정의를 나타내며 내연의 의미를 이용해 객체가 개념에 속하는지 여부를 확인할 수 있다.
- **외연(extension)** : 개념에 속하는 모든 객체의 집합(set)

앨리스의 이야기로 개념의 세 가지 관점을 표현할 수 있다.

- **심볼(symbol)** : 트럼프
- **내연(intension)** : 몸이 납작하고 두 손과 두 발은 네모 귀퉁이에 달려 있는 등장인물
- **외연(extension)** : 정원사, 병사, 신하, 왕자와 공주, 하객으로 참석한 왕과 왕비들, 하트 잭, 하트 왕과 하트 여왕

개념을 구성하는 심볼, 내연, 외연은 객체의 분류 방식에 대한 지침을 제공하지만 개념을 이용해 객체를 분류할 수 있다는 사실이 더 중요하다. 개념을 이용해 공통점을 가진 객체들을 분류할 수 있다는 아이디어는 객체지향 패러다임이 복잡성을 극복하는 데 사용하는 가장 기본적인 인지 수단이기 때문이다.

### 객체를 분류하기 위한 틀

어떤 객체와 마주했을 때 객체에게 적용할 개념을 결정하는 것은 결국 해당 객체를 개념이 적용된 객체 집합의 일원으로 맞아들인다는 것을 의미한다. 객체에 어떤 개념을 적용할 것인지를 결정하는 것은 결국 객체들을 개념에 따라 분류하는 것과 동일하다. 따라서 **분류**란 특정한 객체를 특정한 개념의 객체 집합에 포함시키거나 포함시키지 않는 작업을 의미한다.

> 분류란 객체에 특정한 개념을 적용하는 작업이다. 객체에 특정한 개념을 적용하기로 결심했을 때 우리는 그 객체를 특정한 집합의 멤버로 분류하고 있는 것이다.
> 

분류는 객체지향의 가장 중요한 개념 중 하나다. 어떤 객체를 어떤 개념으로 분류할지가 객체지향의 품질을 결정한다. 객체를 적절한 개념에 따라 분류하지 못한 애플리케이션은 유지보수가 어렵고 변화에 쉽게 대처하지 못한다.

### 분류는 추상화를 위한 도구다

개념을 통해 객체를 분류하는 과정은 추상화의 두 가지 차원을 모두 사용한다.

- **첫 번째 차원인 일반화를 적용** : 정원사, 병사, 신하, 왕자와 공주, 하객으로 참석한 왕과 왕비들, 하트 잭, 하트 왕과 하트 여왕을 **트럼프**라는 개념으로 묶은 것은 개별 객체 간의 차이점은 무시하고 공통점을 취했다.
- **두 번째 차원인 불필요한 세부 사항 제거** : 트럼프에 속하는 객체들의 공통점 중에서도 우리가 중요하다고 생각하는 특징은 몸이 납작하고 두 손과 두 발이 네모난 몸 모서리에 달려 있다는 것 뿐이다. 그 외의 사항들은 이야기에 어떤 도움도 되지 않기 때문에 전적으로 무시했다.

개념은 객체들의 복잡성을 극복하기 위한 추상화 도구다.

## 타입

### 타입은 개념이다

**타입(type)**은 공통점을 기반으로 객체들을 묶기 위한 틀이다. 타입은 개념과 마찬가지로 심볼, 내연, 외연을 이용해 서술할 수 있으며 타입에 속하는 객체 역시 타입의 인스턴스라고 한다.

> 타입은 개념과 동일하다. 따라서 타입이란 우리가 인식하고 있는 다양한 사물이나 객체에 적용할 수 있는 아이디어나 관념을 의미한다. 어떤 객체에 타입을 적용할 수 있을 때 그 객체를 타입의 인스턴스라고 한다. 타입의 인스턴스는 타입을 구성하는 외연인 객체 집합의 일원이 된다.
> 

### 데이터 타입

1. **타입은 데이터가 어떻게 사용되느냐에 관한 것이다.**
    - 숫자형 데이터가 숫자형인 이유는 데이터를 더하거나 빼거나 곱하거나 나눌 수 있기 때문이다. 어떤 데이터가 문자열형인 이유는 두 데이터를 연결해 새로운 문자열을 만들고 문자열의 길이를 알 수 있기 때문이다. 따라서 데이터가 어떤 타입에 속하는지를 결정하는 것은 데이터에 적용할 수 있는 작업이다. **중요한 것은 연산자의 종류가 아니라 어떤 데이터에 어떤 연산자를 적용할 수 있느냐가 그 데이터의 타입을 결정한다는 점**이다.
    - 일반적으로 데이터를 이용해 수행할 수 있는 작업을 **연산자(operator)**라고 한다.
2. 타입에 속한 데이터를 메모리에 어떻게 표현하는지는 외부로부터 철저하게 감춰진다.
    - 데이터 타입의 표현은 연산 작업을 수행하기에 가장 효과적인 형태가 선택되며, 개발자는 해당 데이터 타입의 표현 방식을 몰라도 데이터를 사용하는 데 지장이 없다. 개발자는 해당 데이터 타입을 사용하기 위해 단지 데이터 타입에 적용할 수 있는 연산자만 알고 있으면 되고, 메모리 내부에 숫자 데이터가 어떤 방식으로 저장되는지를 모르더라도 숫자 데이터를 사용할 수 있다.

> **데이터 타입**은 메모리 안에 저장된 데이터의 종류를 분류하는 데 사용하는 메모리 집합에 관한 메타데이터다. 데이터에 대한 분류는 암시적으로 어떤 종류의 연산이 해당 데이터에 대해 수행될 수 있는지를 결정한다.
> 

### 객체와 타입

객체를 타입에 따라 분류하고 그 타입에 이름을 붙이는 것은 결국 프로그램에서 사용할 새로운 데이터 타입을 선언하는 것과 같다.

객체는 행위에 따라 변할 수 있는 상태를 가지고 있지만 데이터는 아니다.

객체에서 중요한 것은 객체의 행동이다. 상태는 행동의 결과로 초래된 부수효과를 쉽게 표현하기 위해 도입한 추상적인 개념일 뿐이다. 객체를 창조할 때 가장 중요하게 고려해야 하는 것은 객체가 이웃하는 객체와 협력하기 위해 어떤 행동을 해야 할지를 결정하는 것이다. 즉, **객체가 협력을 위해 어떤 책임을 지녀야 하는지를 결정하는 것이 객체지향 설계의 핵심**이다.

1. 어떤 객체가 어떤 타입에 속하는지를 결정하는 것은 객체가 수행하는 행동이다. 어떤 객체들이 동일한 행동을 수행할 수 있다면 그 객체들은 동일한 타입으로 분류될 수 있다.
2. 객체의 내부적인 표현은 외부로부터 철저하게 감춰진다. 객체의 행동을 가장 효과적으로 수행할 수만 있다면 객체 내부의 상태를 어떤 방식으로 표현하더라도 무방하다.

### 행동이 우선이다

객체가 어떤 행동을 하느냐에 따라 객체의 타입이 결정된다. 객체의 타입은 객체의 내부 표현과는 아무런 상관이 없다. 따라서 객체의 내부 표현 방식이 다르더라도 어떤 객체들이 동일하게 행동한다면 그 객체들은 동일한 타입에 속한다. 결과적으로 동일한 책임을 수행하는 일련의 객체는 동일한 타입에 속한다고 말할 수 있다.

이것은 객체를 타입으로 분류할 때 사용해야 하는 기준을 명확하게 제시한다.

**어떤 객체를 다른 객체와 동일한 타입으로 분류하는 기준은 무엇인가?**

- 그 객체가 타입에 속한 다른 객체와 **동일한 행동**을 하기만 하면 된다.
- 그 객체가 어떤 데이터를 가지고 있는지는 우리의 관심사가 아니고, 그 객체가 다른 객체와 동일한 데이터를 가지고 있더라도 다른 행동을 한다면 그 객체들은 서로 다른 타입으로 분류돼야 한다.

**결론적으로 객체의 타입을 결정하는 것은 객체의 행동뿐이다.** 객체가 어떤 데이터를 보유하고 있는지는 타입을 결정하는 데 아무런 영향도 미치지 않는다.

위의 동일한 행동이란 동일한 책임을 의미하며, 동일한 책임이란 동일한 메시지 수신을 의미한다. 따라서 동일한 타입에 속한 객체는 내부의 데이터 표현 방식이 다르더라도 동일한 메시지를 수신하고 처리할 수 있다. 다만 내부의 표현 방식이 다르기 때문에 동일한 메시지를 처리하는 방식은 서로 다를 수밖에 없다. 이것은 **다형성**에 의미를 부여한다.

다형성이란 동일한 요청에 대해 서로 다른 방식으로 응답할 수 있는 능력을 뜻한다. 동일한 메시지를 서로 다른 방식으로 처리하기 위해서는 객체들은 동일한 메시지를 수신할 수 있어야 하기 때문에 결과적으로 다형적인 객체들은 동일한 타입(또는 타입 계층)에 속하게 된다.

데이터의 내부 표현 방식과 무관하게 행동만이 고려 대상이라는 사실은 외부에 데이터를 감춰야 한다는 것을 의미한다. 따라서 훌륭한 객체지향 설계는 외부에 행동만을 제공하고 데이터는 행동 뒤로 감춰야 한다. 이 원칙을 흔히 **캡슐화**라고 한다. 공용 인터페이스 뒤로 데이터를 캡슐화하라 라는 오래된 격언은 객체를 행동에 따라 분류하기 위해 지켜야 하는 기본적인 원칙이다.

행동에 따라 객체를 분류하기 위해서는 객체가 내부적으로 관리해야 하는 데이터가 아니라 객체가 외부에 제공해야 하는 행동을 먼저 생각해야 한다. 이를 위해서는 객체가 외부에 재공해야 하는 책임을 먼저 결정하고 그 책임을 수행하는 데 적합한 데이터를 나중에 결정한 후, 데이터를 책임을 수행하는 데 필요한 외부 인터페이스 뒤로 **캡슐화**해야 한다.

흔히 **책임-주도 설계(Responsibility-Driven Design)**라고 부르는 객체지향 설계 방법은 데이터를 먼저 생각하는 **데이터-주도 설계(Data-Driven Design)** 방법의 단점을 개선하기 위해 고안됐다.

객체를 결정하는 것은 행동이다. 데이터는 단지 행동을 따를 뿐이다. 이것이 객체를 객체답게 만드는 

가장 핵심적인 원칙이다.

## 타입의 계층

### 트럼프 계층

<img src="../images/ch03_3.png">

트럼프 인간은 트럼프다. 따라서 모든 트럼프 인간은 동시에 트럼프이기도 하다.

이 관점에서 트럼프는 트럼프 인간을 포괄하는 좀 더 일반적인 개념이다. 트럼프 인간은 트럼프보다 좀 더 특화된 행동을 하는 특수한 개념이다. 이 두 개념 사이의 관계를 **일반화/특수화(generalization/specialization) 관계**라고 한다.

### 일반화/특수화 관계

타입과 타입 사이에는 일반화/특수화 관계가 존재할 수 있다. 트럼프는 트럼프 인간보다 더 일반적인 개념이다. 더 일반적이라는 말은 포괄적이라는 의미를 내포하기 때문에 트럼프는 트럼프 인간에 속하는 객체를 포함한다.

일반화와 특수화는 동시에 일어난다. 트럼프 인간은 트럼프를 좀 더 특수하게 표현한 것이다. 더 특수하다는 것은 일반적인 개념보다 범위가 더 좁다는 것을 의미하므로 트럼프 인간에 속하는 객체는 트럼프에 속하는 객체보다 그 수가 적을 수밖에 없다.

행동의 관점에서 더 일반적인 타입이란 무엇이고 더 특수한 타입이란 무엇일까?

- 일반적인 타입 : 특수한 타입이 가진 모든 행동들 중에서 일부 행동만을 가지는 타입
- 특수한 타입 : 일반적인 타입이 가진 모든 행동을 포함하지만 거기에 더해 자신만의 행동을 추가하는 타입

따라서 일반적인 타입은 특수한 타입보다 더 적은 수의 행동을 가지고 특수한 타입은 일반적인 타입보다 더 많은 수의 행동을 가진다.

### 슈퍼타입과 서브타입

좀 더 일반적인 타입을 **슈퍼타입(super type)**이라고 하고 좀 더 특수한 타입을 **서브타입(sub type)**이라고 한다.

슈퍼타입과 서브타입에서 중요한 것은 두 타입 간의 관계가 행동에 의해 결정된다. 즉, 어떤 타입이 다른 타입의 서브타입이 되기 위해서는 행위적 호환성을 만족시켜야 한다. 일반적으로 서브타입은 슈퍼타입의 행위와 호환되기 때문에 서브타입은 슈퍼타입을 대체할 수 있어야 한다.

<img src="../images/ch03_4.png">

일반화/특수화 관계 표기법

위 그림과 같이 좀 더 일반적인 타입인 슈퍼타입을 상단에, 좀 더 특수한 타입인 서브타입을 하단에 위치시키고 속이 빈 삼각형으로 연결해서 표현한다. 이때 서브타입에서는 슈퍼타입과 중복된 행위를 생략할 수 있다. 서브타입은 슈퍼타입의 행위에 추가적으로 특수한 자신만의 행동을 추가하는 것이므로 슈퍼타입의 행동은 서브타입에게 자동으로 상속된다.

## 정적 모델

### 타입의 목적

왜 타입을 사용해야 할까? 객체지향은 객체를 지향하는 것이므로 객체만 다루면 되는거 아닐까?

- 타입을 사용하는 이유는 인간의 인지 능력으로는 시간에 따라 동적으로 변하는 객체의 복잡성을 극복하기가 어렵기 때문이다.

앨리스의 키는 앨리스가 어떤 음식을 먹을 때마다, 어떤 행동을 할 때마다 시시각각 변한다.  앨리스의 키가 계속 변하고 있었지만 모든 경우에 앨리스는 단지 앨리스일 뿐이다. 앨리스라고 하는 객체의 상태는 변하지만 앨리스를 다른 객체와 구별할 수 있는 식별성은 동일하게 유지된다.

타입은 시간에 따라 동적으로 변하는 앨리스의 상태를 시간과 무관한 정적인 모습으로 다룰 수 있게 해준다.

<img src="../images/ch03_5.png">

### 그래서 결국 타입은 추상화다

이런 관점에서 타입은 추상화다. 어떤 시점에 앨리스에 관해 생각할 때 불필요한 시간이라는 요소와 상태 변화라는 요소를 제거하고 철저하게 정적인 관점에서 앨리스의 모습을 묘사하는 것을 가능하게 해준다.

타입은 추상화다. 타입을 이용하면 객체의 동적인 특성을 추상화할 수 있다. 결국 타입은 시간에 따른 객체의 상태 변경이라는 복잡성을 단순화할 수 있는 효과적인 방법이다.

### 동적 모델과 정적 모델

객체를 생성할 때 우리는 두 가지 모델을 동시에 고려한다.

1. **객체가 특정 시점에 구체적으로 어떤 상태를 가지느냐**. 이를 객체의 **스냅샷(snapshot)**이라고 한다. 객체지향 모델링을 위한 표준 언어인 UML에서 스냅샷은 객체 다이어그램이라고도 불린다. 스냅샷처럼 실제로 객체가 살아 움직이는 동안 상태가 어떻게 변하고 어떻게 행동하는지를 포착하는 것을 **동적 모델(dynamic model)**이라고 한다.
2. **객체가 가질 수 있는 모든 상태와 모든 행동을 시간에 독립적으로 표현하는 것이다.** 일반적으로 이런 모델을 타입 모델(type model) 이라고 하며, 동적으로 변하는 객체의 상태가 아니라 객체가 속한 타입의 정적인 모습을 표현하기 때문에 **정적 모델(static model)** 이라고도 한다.

### 클래스

객체지향 프로그래밍 언어에서 정적인 모델은 클래스를 이용해 구현된다. 따라서 **타입을 구현**하는 가장 보편적인 방법은 클래스를 이용하는 것이다. 클래스와 타입은 동일한 것이 아니다. 타입은 객체를 분류하기 위해 사용하는 개념이다. 반면 클래스는 단지 타입을 구현할 수 있는 여러 구현 메커니즘일 뿐이다.

객체를 분류하는 기준은 타입이며, 타입을 나누는 기준은 객체가 수행하는 행동이다. 객체를 분류하기 위해 타입을 결정한 후 프로그래밍 언어를 이용해 타입을 구현할 수 있는 한 가지 방법이 클래스라는 것이다.

결국 객체지향에서 중요한 것은 동적으로 변하는 객체의 **상태**와 **상태를 변경하는 행위**다.

클래스는 타입을 구현하기 위해 프로그래밍 언어에서 제공하는 구현 메커니즘이다.
