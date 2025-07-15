package boyarsky.chapter1;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimitiveTypeUtil {


  private static final Map<Class<?>, Class<?>> WRAPPER_TYPE_MAP;
  static {
    WRAPPER_TYPE_MAP = new HashMap<Class<?>, Class<?>>(16);
    WRAPPER_TYPE_MAP.put(Integer.class, int.class);
    WRAPPER_TYPE_MAP.put(Byte.class, byte.class);
    WRAPPER_TYPE_MAP.put(Character.class, char.class);
    WRAPPER_TYPE_MAP.put(Boolean.class, boolean.class);
    WRAPPER_TYPE_MAP.put(Double.class, double.class);
    WRAPPER_TYPE_MAP.put(Float.class, float.class);
    WRAPPER_TYPE_MAP.put(Long.class, long.class);
    WRAPPER_TYPE_MAP.put(Short.class, short.class);
    WRAPPER_TYPE_MAP.put(Void.class, void.class);
  }
  public static boolean isPrimitiveType(Object source) {
    //System.out.println("source = " + source + ", " + source.getClass().getName());
    return WRAPPER_TYPE_MAP.containsKey(source.getClass());
  }
  public static void main(String[] args) {
    assertTrue(PrimitiveTypeUtil.isPrimitiveType(false));
    assertTrue(PrimitiveTypeUtil.isPrimitiveType(1L));
    assertFalse(PrimitiveTypeUtil.isPrimitiveType(StringUtils.EMPTY));

    Long l = 2L;
    System.out.println("is Long l a primitive type? = " + PrimitiveTypeUtil.isPrimitiveType(l));

  }
}