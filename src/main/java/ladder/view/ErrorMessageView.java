package ladder.view;

public class ErrorMessageView {

    public enum ErrorMessage {
        INPUT_STRING_DUPLICATE("입력 값이 중복되었습니다."),
        INPUT_STRING_NOT_NULL(" null이 될 수 없습니다."),
        INPUT_PERSON_NAME_IS_INCORRECT("입력한 사람 이름이 올바르지 않습니다."),
        INPUT_STRING_BLANK("입력 값은 공백이 될 수 없습니다."),
        INPUT_LADDER_NUMBER("입력된 숫자가 조건에 맞지 않습니다.");

        private final String message;

        ErrorMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    public static void printErrorMessage(ErrorMessage errorMessage) {
        System.out.println(errorMessage.getMessage());
    }
}
