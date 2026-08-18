package com.example.git_seminar.service;

import org.springframework.stereotype.Service;

@Service
public class SeminarService {

	private final String content = """
			Git은 소스 코드의 변경 이력을 관리하는 분산 버전 관리 시스템입니다.

			1. Repository(저장소): 프로젝트의 파일과 변경 이력이 저장되는 공간입니다.
			2. Commit(커밋): 변경 사항을 저장소에 기록하는 단위로, 각 커밋은 고유한 해시값을 가집니다.
			3. Branch(브랜치): 독립적으로 작업할 수 있는 작업 흐름의 갈래로, 기능 개발이나 실험에 사용됩니다.
			4. Merge(병합): 서로 다른 브랜치의 변경 사항을 하나로 합치는 작업입니다.
			5. Clone(클론): 원격 저장소를 로컬 컴퓨터로 복제하는 작업입니다.
			6. Push/Pull: Push는 로컬 변경 사항을 원격 저장소로 올리는 것이고, Pull은 원격 저장소의 변경 사항을 로컬로 가져오는 것입니다.
			7. Staging Area(스테이징 영역): 커밋하기 전에 변경 사항을 임시로 등록해두는 공간입니다.

			Git을 처음 접한다면 add, commit, push, pull, branch, merge 명령어부터 익히는 것을 추천합니다.
			""";

	public String getContent() {
		return content;
	}
}
