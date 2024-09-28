package main;

import controller.QuizController;
import model.QuizRepository;
import view.QuizView;

public class QuizApp {
    public static void main(String[] args) {
        // Model: クイズデータの管理
        QuizRepository quizRepository = new QuizRepository();

        // View: ユーザーインターフェースの管理
        QuizView quizView = new QuizView();

        // Controller: アプリケーションの流れを制御
        QuizController quizController = new QuizController(quizRepository, quizView);

        // クイズアプリの実行
        quizController.runQuiz();
    }
}
