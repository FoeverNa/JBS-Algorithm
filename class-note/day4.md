# day4

## 과제 리뷰

- 스택으로 구현한거 확인하기 
- 시간없어서 넘어감

## 수업

### 그래프

### 그래프란

- 트리의 확장형, 정확히는 트리가 그래프의 일종
- 객체 간에 짝을 이루는 구조를 나타내기 위한 가장 유연한 자료 구조
  - 방향성도 정의할 수 있고 관계도 제한이없다(부모와 자식 )
  - 자료구조의 끝판왕이라고 한다
- Vertex(Node와 같은것, 꼭지점)와 이를 잇는 Edge(모소리)로 구성된다
  - 벌텍스와 엑지로 받아들이는게 좋다
- Edge는 무향(Undirected) 또는 유향(Directed이 있다
  - 트리구조는 부모에서 자녀로 방향성을 가진 유향이었다
  - 유니디렉션일수있고 바이디션일수도 있다
  - 그야말로 모든걸 정의할수 있게 된다
- Edge에는 가중치(Weidght)가 있을 수 있다.
  - 연결의 정도를 나타낸다
  - 트리는 그냥 온오프라면 그래프는 가중치까지 포함
  - 네비게이션 예에서 벌텍스에서 벌텍스까지 얼마나 시간이 걸릴지 결정할수도있다
  - 화소들간의 관계를 엣지들의 가중치로 표현할수도 있다
    - 색상차이를 하나하나화소에 관계들의 가중치로 표현할수 가 있다
  - 정의하기 나름이라 응용 되는 예는 무궁무진하다

#### 그래프와 트리의 관계

- 트리는 방향성 비순환 그래프의 일종으로 볼 수 있다
  - 트리는 사이클이 생기지 않기 때문에 비순환
  - 루프에서 리프쪽으로 진행되는 방향성을 지니고 있따
  -  DAG 대그라고 있는다

#### 그래프의 종류

- 무향 그래프
  - Vertext간에 관계가 동일 한것
  - 서로의 방향성과 관계없이 동일하게 따진다
- 유향 그래프
  - 2개의 Vertext간에 관계가 방향성을 있어 쌍뱡향으로 방향성을 가질 수 있다
  - 방향에 따라 가중치를 가질 수 있다
    - 높은곳에서 낮은 곳으로 진행하면 빠르지만 반대는 다를수있다
- 멀티그래프
  - 그래프는 자유도이다
    - 다표현할수 있어야 한다
  - 2개의 Vertex사이에 여러개의 연결이 정의가 가능하다
  - 연결간의 웨이트가 달라질수있고 방향도 달라질 수 있다
  - 자기 자신으로의 연결이 있을 수 있다
- 실제로 사용할 때는 Un나 Directed와 같이 어느정도는 제한된 것을 사용하게된다
  - 너무자유로우면 데이터를 무제한으로 표현하기 위함이다

#### 그래프의 관련용어

- 경로(Path) : 두개의 Vertext를 연결하는 Edge들에 순서쌍(Sequnece)
  - Vertex는포함안되고 연결만 이야기해야한다
  - 1에서 2, 2에서3, 이런 식으로
- Circuit: Path중에 자기자신으로 돌아온 연결
  - Circuit이 발생할수 있기ㅣ 메--때문이다
  - 탐색할때 샥샥되지 않는 이유는 서킷이 있기 때문이다
- 부분 그래프(SubGraph) : 그래프 중에  일부를 때내온디낵

Connedcted

- 모든 Vertext가 선으로 연결이 되어 있는것
  - Vertex 2개만 놓고 연결되있다는건 path가 존재한다는 듯이다
- 반대로 끊어진게 이쓰면 disConnected 라고 부ㅡ른다

Disconnected

- 전부 연결이 안되어있는 상태



#### 그래프의 구현 방법

- 인접리스트(Adjacency List)
  -  Vertex를 표현할때 인전 모든 Vertex를 나열한다(Adjacentcy List에 등록한다)
    -  value도 있고 Adj list도 있는 것
  - 무향일대도 쓰고 유향일때도 사용한다
  - Weight도 같이 사용할 수 있다
    - 보통은 Weight 없을 때사용한다
  - Spars(희박한)할 경우 유리한다
    - 연결이 희박할 수록 유리하다
    - 얼마나 적어야 하나? 그때그때 다르다
      - 보통은 10%이하 같이 어떤 기준을 가지고 사용한다
- 인접 행렬(Adjacency Matrix) 
  - Dens할 경우 유리하다
  - Adjaxency Matrix를 가지고 있다
    - Matrix로 각 Vertex간의 연결을 매트릭스로 적어논다
    - 무향그래프는 가운데를 기준으로 대칭된다
      - 그래서Upper Triangle만 표현하기도한다
    - 장점은 노드의 정보들이 하나로 뭉처져있다보니 다루기가 쉽다
      - matrix 구조가 효율적으로 다를 수 있따
      - 그래서실제로 가장많이 사용되는 방법이다
      - Array가 가장많이쓰이는 것처럼 얘도 마찬가지이다
    - 단점은 메모리를 많이 잡아 먹는다

#### 그래프의 탐색방법

- 이진트리의 너비우선 탐색
  - 큐를 이용하는 방법이 가장 쉽다
  - 루트를 큐에 넣고 큐에서빼면서 자식들을 큐에 넣고 이걸 다 할때까지 반복
- 너비 우선 탐색(Bredth-Frist Search)
  - 그래프는 시작이 어느것이나 될 수가 있다
    - 그래프는 순번이 없기 때문이다
  - visited가 있다
    - 사이클이 있기 때문에 그래프는 돌아서 자기자신으로 돌아올수가 있다
    - 탐색하다보면 자기자신이 또 나올수가 있다
  - 큐에 일단 처음께 들어가고 큐에서 빼면서 adjace한애들이 다들어간다(순서는 상관이 없다)
    - 큐에서 뺀애들은 visited에 포함시킨다
  - 다음껄 꺼내고 visited에 포함시키고 adjace가 들어간다.
    - visite에 있으면 꺼낸애들은 넘어가고 다른걸 처리한다
  - 그렇게해서 모든 큐가 처리되면 끝난다
  - 순서를 살펴보면 가장가깝게 갈수있는것 기준으로 너비먼저 탐색을 하게된다
- 깊이 우선탐색(Depth-Frist SEarch)
  - 재귀(Recursive)함수를 이용하여 구현한다
  - viste을 활용한다
  - Queue대신에 Stack을 쓰면 재귀함수동작하는것과 똑같이 동작한다
    - 메서드 재귀로 돌리는거는 스택이랑 동작이 똑같다(메소드 콜스택을 활용하는거니까)
  - 재귀로 모든 근접한애들을 다접근해서 돌아가게 하면 하나씩쌓이면서 끝난다
  - 
- 언제 무얼사용해야할까?
  - 너비우선탐색은 특정 조건을 만족하면서 제일 빨리가는 거리 찾을때
    - 왜냐면 거리별로 탐색하기때문에
  - dfs는 멀리있는애까지 먼저 쭉 훑는다.
    - 그래서 멀리있을게 확실할때 이걸 사용한다
  - 결론적으로는 거리별 속도가 중요한데 가까운걸 찾냐 멀리있는걸 찾냐라는 차이이다

## 맥스힙MaxHeap

### Max Heap이란 (=Priority Queue)

- 항상 최대 값이 루트노드에 존재하는 트리 구조

  - 다른 노드의 값은 중요하지 않다

- 배열로 이루어진 완전 이진트리를 기반으로 한다

  - array에 맨앞값이 최대값인 배열
  - 어느정도까지는 꽉차있는 트리구조
    - 어느정도까지 있는지알아야도기때문에 legth를 가진다

- 들어간것중에 계속 최대값(혹은 최소값)이 가장 작은값이 나오게되는 큐처럼 동작한다

- 자료를 트리에서 제거하거나 추가할 대 이를 위한 추가동작을 구현한다

  - 효율적으로 구현되어 있다

  

### Max Heap의 장점

- 일반 배열에서 최대값을 찾아 반환하는 연산 : O(N)
- 정렬된 배열에서 최대값을 찾아 반환하는 연산 : O(1) ,  (단, 정렬하는 연산 O(NlogN))
  - 배열에서 그냥 배열에서 찾는게 더빠를 수 있다
  - 배열에 새로운 자료를 추가하는 연산: O(N)
    - 정렬된 자료에 값을 넣으려면 찾아야되고(O(N), 상입을 위히( O(N)

- Maxe Heap에서 최대값을 찾아봔한하는 연산 O(logN)
  - Max Heap에 최대값을 추가하는 연산 :O(longN(
- 그래서 MAxHeap은 다른 기능은 못하지만 최대값하나만 몰빵한 구조이다



### Max Heap / Min Heap의 정의

- MaxHeap : 부모 노드가 항상 자식노드보다 큰 완전 이진트리
  - 자기부모자식과만 관계있지 sibling들과는 연관을 짓지 않기 때문에 숫자의 벨러스가 많지 않다
  - 넣는순서에 따라 MaxHeap모양이 달라질수이다
- Min Heap : 

### Heap 자료 입력하기

- 배열의 마지막에 새로운 자료 추가
- 부모노드와 비교하여 두값을 swap을 해야 하는지 여부 결정
- 끝까지 반복하기
- 왜 log2N인가?
  - 하이트 만큼만 스왑이 일어나기때문에
  - N개를 모두 훑을 필요가 없이 딱 하이트만큼만 작동을 한다
  - 그래서 O(LogN)이 된다

### Heap에서 자료를 삭제하기

- 항상 루트(배열의 첫번째 자료)의 자료를 삭제한다
- 맨끝에 애를 올려서 루트로 만든다
  - CBT를 유지하기 위해서 맨끝에서 가져온다
- 두개의 자식노드 중 부모의 자리를 대체할 노드를 선택
  - 둘중에 하나 중 큰애가 위로 올라오게 된다
- 아래로 타고나서 큰애를 부모로 올리는걸 반복한다
  - 바뀐쪽에 트리만 MaxHeap으로 만들어주면된다
- 이것도 최대높이 만큼 swap이 일어나기에 O(logN)이 된다

### Java에 구현된 Heap

- PriorityQueu 으로 구현되어 있다

  - 더작은게 먼저올라도오록 구현되어있다
  - MinHeap이 된다

- Max로 바꾸려면

  - 값을 -로 바꾸어서 입력한다

  - Comparator를 구현한다

    - ```java
      PriorityQueue<Integer> pq = new PriorityQueue<>(
              (a, b) -> Integer.compare(b, a)
      //        (a, b) -> -Integer.compare(b, a)
      );
      ```

- 객체를 이용한 pq

  ```java
  class NOde {
      public int data;
      public int priority
          
      public NOde(int data, int priority) {
          this.data = data;
          this. pritorit =priority;
      }
  }
  
  public class Main {
      public static vodi main )() {
          PriorityQueue<Node> pq = new PritorityQuee<>(
              a,b -> Integer.comaper(a.pritoriy, b.priority) //변환되는것 확인하기
          );
       
          pq.offer(new Node(53, 5));
          pq.offer(new Node(253, 2));
          pq.offer(new Node(583, 1));
      )
  }
  ```

  - 보통은 pritority가 낮을수록 우선순위 높지만 절대적인것은 아니다

- 구현은 혼자해보기



## 다익스트라 Dijkstra 알고리즘

## Dijkstra 알고리즘의 정의

- 한노드를 기준으로 나머지 노드까지 가는 최단 거리를 계산하는 것

## Djkstar 알고리즘의 원리

- 탐욕 알고리즘이면서, 다이나믹 프로그래밍 기법을 사용한다
  - 가장 가중치가 작은 간선부터 하나씩 탐색(탐욕 알고리즘)
  - 탐색 과정에서 최단 거리를 기억하여 이를 누적하여 빠르게 최단 거리 계산(다이나믹 프로그래밍)
    - 추가로 풀어야 하는부분만 풀어서 계산 값을 저장해 놓기

## Dijkstar 알고리즘의 구현

- 각 노드에 도달하는 최소 거리를 기억하기 위해 배열distance를 생성하고 무한대 값으로 초기화
  - size는 노드의 갯수
  - 시작노드와 시작노드의 거리는 0이기에 시작노드에 0을넣는다
  - 
- 시작노드에서 해당노드까지 거리를 정렬기준으로 하는 Min Heap 생성
  - BFS랑 똑같이 진행되는데 priorityQueue를 사용한다
  - 시작 노드를 넣는다
  - 큐에서 뺀다
  - 0에서 연결된애들을 다본다
  - 1과의 거리를 계산한다
    - 1의 거리를 2로 계산된다
  - 업데이트된 노드가 큐에 들어가고 디스턴스를 같이넣어준다
    - 디스턴스가 priroity가 된다
    - =그리디의 기준이 pritority가 된다
  - pritority가 가장 작은것부터  큐에서 빼고 업데이트를 계속한다
    - 주변애들 비교해서 이미 있는 distance와 비교해서 값이 작으면 업데이트하고 아니면 넘긴다
  - 이렇게해서 큐가 다빠질때까지 하고 끝난다
  - bfs랑 비슷
    - que 대신 pq사용
    - visited eㅐ신 distacne사용








































