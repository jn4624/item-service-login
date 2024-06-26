package hello.item.web;

import hello.item.domain.member.Member;
import hello.item.web.argumentresolver.Login;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequiredArgsConstructor
public class HomeController {
//    private final MemberRepository memberRepository;
//    private final SessionManager sessionManager;

//    @GetMapping("/")
//    public String home() {
//        return "home";
//    }

//    @GetMapping("/")
//    public String homeLogin(@CookieValue(name = "memberId", required = false) Long memberId, Model model) {
//        if (memberId == null) {
//            return "home";
//        }
//
//        // 로그인
//        Member loginMember = memberRepository.findById(memberId);
//
//        if (loginMember == null) {
//            return "home";
//        }
//
//        model.addAttribute("member", loginMember);
//
//        return "loginHome";
//    }

//    @GetMapping("/")
//    public String homeLoginV2(HttpServletRequest request, Model model) {
//        // 세션 관리자에 저장된 회원 정보 조회
//        Member member = (Member) sessionManager.getSession(request);
//
//        if (member == null) {
//            return "home";
//        }
//
//        model.addAttribute("member", member);
//
//        return "loginHome";
//    }

//    @GetMapping("/")
//    public String homeLoginV3(HttpServletRequest request, Model model) {
//        // 세션 관리자에 저장된 회원 정보 조회
//        HttpSession session = request.getSession(false);
//
//        if (session == null) {
//            return "home";
//        }
//
//        Member member = (Member) session.getAttribute(SessionConst.LOGIN_MEMBER);
//
//        if (member == null) {
//            return "home";
//        }
//
//        model.addAttribute("member", member);
//
//        return "loginHome";
//    }

//    @GetMapping("/")
//    public String homeLoginV3Spring(@SessionAttribute(name = SessionConst.LOGIN_MEMBER, required = false) Member member, Model model) {
//        if (member == null) {
//            return "home";
//        }
//
//        model.addAttribute("member", member);
//
//        return "loginHome";
//    }

    @GetMapping("/")
    public String homeLoginV3ArgumentResolver(@Login Member member, Model model) {
        if (member == null) {
            return "home";
        }

        model.addAttribute("member", member);

        return "loginHome";
    }
}
