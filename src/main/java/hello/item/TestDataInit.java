package hello.item;

import hello.item.domain.item.Item;
import hello.item.domain.item.ItemRepository;
import hello.item.domain.member.Member;
import hello.item.domain.member.MemberRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestDataInit {
    private final ItemRepository itemRepository;
    private final MemberRepository memberRepository;

    /**
     * 테스트용 데이터 추가
     */
    @PostConstruct
    public void init() {
        itemRepository.save(new Item("itemA", 10000, 10));
        itemRepository.save(new Item("itemB", 20000, 20));

        Member member = new Member();
        member.setLoginId("admin");
        member.setPassword("admin!");
        member.setName("관리자");
        memberRepository.save(member);
    }
}
