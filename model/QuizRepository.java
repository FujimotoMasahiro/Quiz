package model;

import java.util.ArrayList;

public class QuizRepository {
    private ArrayList<Quiz> quizList; // クイズを格納するリスト

    // コンストラクタ
    public QuizRepository() {
        quizList = new ArrayList<>();
        initializeQuizzes(); // クイズの初期化
    }

    // クイズをリストに追加
    public void addQuiz(Quiz quiz) {
        quizList.add(quiz);
    }

    // 指定されたインデックスのクイズを取得
    public Quiz getQuiz(int index) {
        if (index >= 0 && index < quizList.size()) {
            return quizList.get(index);
        } else {
            return null;
        }
    }

    // クイズの総数を取得
    public int getQuizCount() {
        return quizList.size();
    }

    // クイズの初期化
    private void initializeQuizzes() {
        // サンプルクイズを追加
        addQuiz(new Quiz("１＋１は？", new String[] {
            "１",
            "１１",
            "２",
            "田んぼんぽ田"
        }, 3));

        addQuiz(new Quiz("Javaの拡張子はどれですか？", new String[] {
            ".java",
            ".jav",
            ".js",
            ".py"
        }, 1));

        addQuiz(new Quiz("最近炎上した芸人は？", new String[] {
            "フワちゃん",
            "草薙剛",
            "海老蔵",
            "ピエール瀧"
        }, 1));

        // 必要に応じてクイズを追加
    }
}
