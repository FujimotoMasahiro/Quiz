package controller;

import model.Quiz;
import model.QuizRepository;
import view.QuizView;

public class QuizController {
    private QuizRepository quizRepository; // クイズデータを管理
    private QuizView quizView; // ユーザーインターフェースを管理

    // コンストラクタ
    public QuizController(QuizRepository quizRepository, QuizView quizView) {
        this.quizRepository = quizRepository;
        this.quizView = quizView;
    }

    // クイズアプリの実行
    public void runQuiz() {
        int score = 0; // 正解数のカウント
        int totalQuizzes = quizRepository.getQuizCount(); // 全クイズの数

        for (int i = 0; i < totalQuizzes; i++) {
            Quiz quiz = quizRepository.getQuiz(i); // クイズを取得
            quizView.displayQuiz(quiz); // クイズを表示

            int userAnswer = quizView.getUserAnswer(); // ユーザーの回答を取得
            if (userAnswer == quiz.getCorrectAnswer()) {
                quizView.displayResult(true); // 正解の場合
                score++; // スコアを加算
            } else {
                quizView.displayResult(false); // 不正解の場合
            }

            System.out.println(); // 空行を入れて次のクイズへ
        }

        // 最終的な得点を表示
        quizView.displayScore(score, totalQuizzes);
    }
}
