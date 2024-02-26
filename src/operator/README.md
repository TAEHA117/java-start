# 산술 연산자
### 연산자 시작
, - , * , / 와 같이 계산을 수행하는 기호를 연산자라 한다.<br>
자바에는 다양한 연산자가 있다. <br>
참고로 더 많은 연산자가 있지만, 실무에서 주로 다루는 연산자 위주로 숙지해보자.

#### 연산자 종류
* 산술 연산자: + , - , * , / , % (나머지 연산자)
* 증감(증가 및 감소) 연산자: ++ , --
* 비교 연산자: == , != , > , < , >= , <=
* 논리 연산자: && (AND), || (OR), ! (NOT)
* 대입 연산자: = , += , -= , *= , /= , %=
* 삼항 연산자: ? :

#### 연산자와 피연산자
```
3 + 4
a + b
```
연산자(operator): 연산 기호 - 예) + , -
피연산자(operand): 연산 대상 - 예) 3 , 4 , a , b

### 산술 연산자
#### 산술 연산자는 주로 숫자를 계산하는 데 사용된다. 우리가 이미 잘 알고 있는 수학 연산을 수행한다.
* (더하기)
* (빼기)
* (곱하기)
* / (나누기)
*  % (나머지)

코드 작성해보기<br>
<b>Operator1</b>
```
java
package operator;
public class Operator1 {
 public static void main(String[] args) {
 // 변수 초기화
 int a = 5;
 int b = 2;
 // 덧셈
 int sum = a + b;
 System.out.println("a + b = " + sum); // 출력: a + b = 7
 // 뺄셈
 int diff = a - b;
 System.out.println("a - b = " + diff); // 출력: a - b = 3
 // 곱셈
 int multi = a * b;
 System.out.println("a * b = " + multi); // 출력: a * b = 10
 // 나눗셈
 int div = a / b;
 System.out.println("a / b = " + div); // 출력: a / b = 2
 // 나머지
 int mod = a % b;
 System.out.println("a % b = " + mod); // 출력: a % b = 1
 }
```
