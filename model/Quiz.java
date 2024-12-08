package model;

public class Quiz {
    private String question; // 問題文
    private String[] options; // 選択肢の配列
    private int correctAnswer; // 正解の選択肢番号 (1から4)

    /**
     * クイズを生成するコンストラクタ
     * 
     * @param question 問題文の文字列
     * @param options 回答選択肢の配列（文字列）
     * @param correctAnswer 正解の番号
     */
    public Quiz(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    // 問題文を取得
    public String getQuestion() {
        return question;
    }

    // 選択肢を取得
    public String[] getOptions() {
        return options;
    }

    // 正解の番号を取得
    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
