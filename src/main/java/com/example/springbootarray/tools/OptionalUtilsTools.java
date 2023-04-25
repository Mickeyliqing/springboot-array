package com.example.springbootarray.tools;

import com.example.springbootarray.model.User;

import java.util.Optional;

public class OptionalUtilsTools {
    public static void main(String[] args) {
        User user = new User(null, 22);

        /**
         * Optional.ofNullable 和 Optional.of 区别
         * Optional.ofNullable 传入 null 不会报错，而 Optional.of 传入 null 会报错
         * Optional.ofNullable 会生成 Optional<class> 对象实例，从而拿到对应对象的属性值，如果不为 null ，则返回对应属性值，如果为空，则返回自定义的值
         *
         * orElseGet 和 orElse 的区别
         * orElseGet 当 Optional.ofNullable 传入的值不为 null 的时候，orElseGet 就不在创建和执行，但 orElse 依然会创建
         * orElseGet 可以在方法内部实现更复杂的逻辑
         *
         * orElseThrow 如果对应的值为 null 则会抛出异常
         *
         * isPresent() 如果对应属性不为空返回 true,否则返回 false
         *
         * filter 添加过滤条件，返回满足指定条件的对象，否则返回 null
         */
        Optional.ofNullable(user).map(User::getAge).isPresent();
        Optional.of(user).filter(m -> "".equals(m.getName())).map(User::getAge);
    }
}
