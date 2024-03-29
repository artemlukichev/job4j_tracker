package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
      Output out = new StubOutput();
      Input in = new StubInput(
              new String[] {"one", "2"}
      );
      ValidateInput input = new ValidateInput(out, in);
      int selected = input.askInt("Enter menu:");
      assertThat(selected).isEqualTo(2);
    }

    @Test
    public void when2validInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "2"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
        int selectedRe = input.askInt("Enter menu:");
        assertThat(selectedRe).isEqualTo(2);
    }

    @Test
    public void whenMinus1Input() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }

}