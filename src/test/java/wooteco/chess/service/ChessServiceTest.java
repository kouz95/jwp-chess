package wooteco.chess.service;// package wooteco.chess.service;
//
// import static wooteco.chess.domain.position.Fixtures.*;
// import static org.assertj.core.api.Assertions.*;
//
// import java.util.LinkedHashMap;
// import java.util.Map;
//
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.ValueSource;
//
// import wooteco.chess.domain.board.Board;
// import wooteco.chess.domain.piece.Empty;
// import wooteco.chess.domain.piece.Piece;
// import wooteco.chess.domain.piece.Rook;
// import wooteco.chess.domain.piece.Team;
// import wooteco.chess.domain.position.MoveInfo;
// import wooteco.chess.domain.position.Position;
//
// class ChessServiceTest {
// 	private Board board;
//
// 	@BeforeEach
// 	void setUp() {
// 		Map<Position, Piece> map = new LinkedHashMap<>();
// 		map.put(A3, new Empty(A3));
// 		map.put(A4, new Rook(A4, Team.BLACK));
// 		board = Board.of(map);
// 	}
//
// 	@ParameterizedTest
// 	@ValueSource(strings = {"a3 a5", "a4 a5"})
// 	void move_Fail_When_SelectNotAlly(String input) {
// 		assertThatIllegalArgumentException()
// 			.isThrownBy(() -> ChessService.of(board).move(MoveInfo.of(input), Team.WHITE))
// 			.withMessage("아군 기물의 위치가 아닙니다.");
// 	}
// }