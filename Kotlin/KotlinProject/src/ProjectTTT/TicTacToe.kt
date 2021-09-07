package ProjectTTT

import java.util.*

fun main() {
    var arr = Array<IntArray>(3) { IntArray(3) };

    println(arr.contentDeepToString())

    val first = 1;
    val second = 2;
    var select = first;
    var cnt = 0;

    while(cnt <= 9) {
        cnt++;
        println("$cnt" + "번째 턴")

        println("   0     1     2");
        println("0  ${arr[0][0]}  |  ${arr[0][1]}  |  ${arr[0][2]}")
        println("1  ${arr[1][0]}  |  ${arr[1][1]}  |  ${arr[1][2]}")
        println("2  ${arr[2][0]}  |  ${arr[2][1]}  |  ${arr[2][2]}")

        print("Player $select 입력(줄, 칸) : ");

        var input : String? = readLine()
        // !! null이 절대 들어갈 수 없다.
        if(input?.length!! > 3) {
            println("잘못입력하셨습니다.")
            cnt--;
            continue;
        }

        // 로직
        var token = input?.split(",")
        var x = token[0].toInt();
        var y = token[1].toInt();

        if(arr[x][y] != 0) {
            println("값이 이미 있습니다.")
            cnt--;
            continue;
        }

        arr[x][y] = select;

        // 검사
        if((arr[0][0] == select && arr[0][1] == select && arr[0][2] == select) ||
            (arr[1][0] == select && arr[1][1] == select && arr[1][2] == select) ||
            (arr[2][0] == select && arr[2][1] == select && arr[2][2] == select) ||
            (arr[0][0] == select && arr[1][0] == select && arr[2][0] == select) ||
            (arr[0][1] == select && arr[1][1] == select && arr[2][1] == select) ||
            (arr[0][2] == select && arr[1][2] == select && arr[2][2] == select) ||
            (arr[0][0] == select && arr[1][1] == select && arr[2][2] == select) ||
            (arr[0][2] == select && arr[1][1] == select && arr[2][0] == select) ) {
                // 승리
            println("Player $select 승리!");
            break;
        }

        if(select == first)
            select = second;
        else
            select = first;

        // 종료 조건

        println();
    }
}