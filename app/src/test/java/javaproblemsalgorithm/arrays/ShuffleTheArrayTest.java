package javaproblemsalgorithm.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShuffleTheArrayTest {

  private ShuffleTheArray shuffleTheArray;

  @BeforeEach
  void start() {
    this.shuffleTheArray = new ShuffleTheArray();
  }

  @Test
  void testShuffle() {
    int[] inputA = { 2, 5, 1, 3, 4, 7 };
    int inputB = 3;
    int[] output = { 2, 3, 5, 4, 1, 7 };
    int[] result = this.shuffleTheArray.shuffle(inputA, inputB);

    assertArrayEquals(output, result);

  }

  @Test
  void testShuffleCaseTwo() {
    int[] inputA = { 1, 2, 3, 4, 4, 3, 2, 1 };
    int inputB = 4;
    int[] output = { 1, 4, 2, 3, 3, 2, 4, 1 };
    int[] result = this.shuffleTheArray.shuffle(inputA, inputB);

    assertArrayEquals(output, result);

  }

  @Test
  void testShuffleCaseThree() {
    int[] inputA = { 643, 84, 23, 282, 936, 464, 820, 812, 119, 883, 263, 137, 670, 534, 837, 667, 661, 356, 118, 893,
        159, 286, 872, 20, 44, 42, 211, 698, 266, 572, 323, 970, 376, 961, 582, 932, 870, 44, 867, 768, 985, 719, 623,
        672, 507, 730, 660, 925, 470, 656, 446, 382, 893, 551, 183, 213, 385, 602, 299, 10, 142, 155, 278, 342, 346,
        809, 377, 736, 96, 347, 799, 636, 37, 43, 277, 168, 154, 598, 297, 370, 405, 562, 133, 301, 118, 490, 749, 246,
        957, 50, 316, 184, 878, 536, 747, 73, 310, 413, 856, 337, 307, 425, 112, 102, 575, 931, 493, 486, 346, 862, 818,
        1000, 832, 352, 128, 491, 119, 717, 510, 437, 39, 310, 344, 753, 704, 916, 160, 942, 171, 642, 579, 385, 826,
        998, 655, 90, 68, 828, 87, 203, 768, 227, 63, 395, 9, 101, 404, 570, 532, 297, 460, 943, 501, 808, 599, 732,
        696, 223, 434, 86, 378, 226, 268, 600, 796, 171, 442, 197, 368, 118, 66, 842, 885, 874, 719, 29, 925, 539, 463,
        771, 694, 207, 122, 510, 408, 263, 213, 657, 44, 971, 817, 222, 639, 150, 108, 203, 470, 388, 371, 560, 847,
        155, 108, 611, 500, 152, 578, 416, 654, 697, 434, 899, 534, 508, 696, 940, 910, 331, 854, 511, 511, 651, 687,
        896, 207, 556, 625, 954, 225, 10, 349, 723, 986, 765, 921, 326, 838, 330, 37, 538, 152, 896, 264, 618, 803, 160,
        863, 389, 597, 302, 736, 724, 827, 482, 68, 820, 87, 529, 890, 938, 41, 68, 231, 134, 42, 308, 16, 778, 865,
        460, 339, 883, 165, 820, 153, 890, 672, 472, 992, 381, 518, 392, 923, 543, 515, 35, 588, 93, 695, 814, 825, 531,
        777, 615, 79, 765, 437, 928, 773, 212 };
    int inputB = 150;
    int[] output = { 1, 2, 1, 2 };
    int[] result = this.shuffleTheArray.shuffle(inputA, inputB);

    assertArrayEquals(output, result);

  }
}
