# SkillCheckLevel1



## 테스트통과 스크린샷

- 테스트를 3번 보았는데 3번다 한문제당 40분이상이 걸려서 테스트를 통과하지 못했습니다.



## [예산](https://programmers.co.kr/learn/courses/30/lessons/12982)

### 풀이

```java
import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {

        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        for (int i = 0; i < d.length ; i++) {
            sum += d[i];
           if(sum  > budget) {
               answer = i;
               break;
           }else if(sum == budget) {
                answer = i+1;
                break;
            } else {
               answer = i+1;
           }

        }

        return answer;
    }
}
```



## [소수찾기](https://programmers.co.kr/learn/courses/30/lessons/12921)

소수를 찾는 다른 방법을 생각하지 못해서 시간초과로 테스트를 모두 통과하지 못했습니다.

### 풀이



```java
import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {

        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        for (int i = 0; i < d.length ; i++) {
            sum += d[i];
           if(sum  > budget) {
               answer = i;
               break;
           }else if(sum == budget) {
                answer = i+1;
                break;
            } else {
               answer = i+1;
           }

        }

        return answer;
    }
}
```


## [시저암호](https://programmers.co.kr/learn/courses/30/lessons/12926)

### 풀이

```java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s, int n) {

        char[] charArray = s.toCharArray();
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == ' ') {
                characterList.add(' ');
            } else {
                if (Character.isUpperCase(charArray[i])) {
                    int sum = (int)charArray[i] + n;
                    if (sum > 90) {
                        int value = sum-90;
                        sum = 64 + value;
                    }
                    characterList.add((char)sum);
                } else if (Character.isLowerCase(charArray[i])) {
                    int sum = (int) charArray[i] + n;
                    if (sum > 122) {
                        int value = sum - 122;
                        sum = 96 + value;
                    }
                    characterList.add((char) sum);
                }
            }

        }


        return  characterList.stream().map(String::valueOf)
                .collect(Collectors.joining());
    }
}
```

