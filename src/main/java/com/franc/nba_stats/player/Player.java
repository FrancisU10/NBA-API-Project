package com.franc.nba_stats.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_stats")
public class Player {
    @Id
    @Column(name = "player_id")
    private Long playerId;

    @Column(name = "player_name")
    private String playerName;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "team_abbreviation")
    private String teamAbbreviation;

    @Column(name = "age")
    private Float age;

    @Column(name = "gp")
    private Integer gp;

    @Column(name = "w")
    private Integer w;

    @Column(name = "l")
    private Integer l;

    @Column(name = "w_pct")
    private Float wPct;

    @Column(name = "min")
    private Float min;

    @Column(name = "fgm")
    private Integer fgm;

    @Column(name = "fga")
    private Integer fga;

    @Column(name = "fg_pct")
    private Float fgPct;

    @Column(name = "fg3m")
    private Integer fg3m;

    @Column(name = "fg3a")
    private Integer fg3a;

    @Column(name = "fg3_pct")
    private Float fg3Pct;

    @Column(name = "ftm")
    private Integer ftm;

    @Column(name = "fta")
    private Integer fta;

    @Column(name = "ft_pct")
    private Float ftPct;

    @Column(name = "oreb")
    private Integer oreb;

    @Column(name = "dreb")
    private Integer dreb;

    @Column(name = "reb")
    private Integer reb;

    @Column(name = "ast")
    private Integer ast;

    @Column(name = "tov")
    private Integer tov;

    @Column(name = "stl")
    private Integer stl;

    @Column(name = "blk")
    private Integer blk;

    @Column(name = "blka")
    private Integer blka;

    @Column(name = "pf")
    private Integer pf;

    @Column(name = "pfd")
    private Integer pfd;

    @Column(name = "pts")
    private Integer pts;

    @Column(name = "plus_minus")
    private Integer plusMinus;

    @Column(name = "nba_fantasy_pts")
    private Float nbaFantasyPts;

    @Column(name = "dd2")
    private Integer dd2;

    @Column(name = "td3")
    private Integer td3;

    @Column(name = "wnba_fantasy_pts")
    private Float wnbaFantasyPts;

    @Column(name = "gp_rank")
    private Integer gpRank;

    @Column(name = "w_rank")
    private Integer wRank;

    @Column(name = "l_rank")
    private Integer lRank;

    @Column(name = "w_pct_rank")
    private Integer wPctRank;

    @Column(name = "min_rank")
    private Integer minRank;

    @Column(name = "fgm_rank")
    private Integer fgmRank;

    @Column(name = "fga_rank")
    private Integer fgaRank;

    @Column(name = "fg_pct_rank")
    private Integer fgPctRank;

    @Column(name = "fg3m_rank")
    private Integer fg3mRank;

    @Column(name = "fg3a_rank")
    private Integer fg3aRank;

    @Column(name = "fg3_pct_rank")
    private Integer fg3PctRank;

    @Column(name = "ftm_rank")
    private Integer ftmRank;

    @Column(name = "fta_rank")
    private Integer ftaRank;

    @Column(name = "ft_pct_rank")
    private Integer ftPctRank;

    @Column(name = "oreb_rank")
    private Integer orebRank;

    @Column(name = "dreb_rank")
    private Integer drebRank;

    @Column(name = "reb_rank")
    private Integer rebRank;

    @Column(name = "ast_rank")
    private Integer astRank;

    @Column(name = "tov_rank")
    private Integer tovRank;

    @Column(name = "stl_rank")
    private Integer stlRank;

    @Column(name = "blk_rank")
    private Integer blkRank;

    @Column(name = "blka_rank")
    private Integer blkaRank;

    @Column(name = "pf_rank")
    private Integer pfRank;

    @Column(name = "pfd_rank")
    private Integer pfdRank;

    @Column(name = "pts_rank")
    private Integer ptsRank;

    @Column(name = "plus_minus_rank")
    private Integer plusMinusRank;

    @Column(name = "nba_fantasy_pts_rank")
    private Integer nbaFantasyPtsRank;

    @Column(name = "dd2_rank")
    private Integer dd2Rank;

    @Column(name = "td3_rank")
    private Integer td3Rank;

    @Column(name = "wnba_fantasy_pts_rank")
    private Integer wnbaFantasyPtsRank;

    @Column(name = "team_count")
    private Integer teamCount;

    public Player() {
    }

    public Player(Long playerId, String playerName, String nickname, Long teamId, String teamAbbreviation, Float age, Integer gp, Integer w, Integer l, Float wPct, Float min, Integer fgm, Integer fga, Float fgPct, Integer fg3m, Integer fg3a, Float fg3Pct, Integer ftm, Integer fta, Float ftPct, Integer oreb, Integer dreb, Integer reb, Integer ast, Integer tov, Integer stl, Integer blk, Integer blka, Integer pf, Integer pfd, Integer pts, Integer plusMinus, Float nbaFantasyPts, Integer dd2, Integer td3, Float wnbaFantasyPts, Integer gpRank, Integer wRank, Integer lRank, Integer wPctRank, Integer minRank, Integer fgmRank, Integer fgaRank, Integer fgPctRank, Integer fg3mRank, Integer fg3aRank, Integer fg3PctRank, Integer ftmRank, Integer ftaRank, Integer ftPctRank, Integer orebRank, Integer drebRank, Integer rebRank, Integer astRank, Integer tovRank, Integer stlRank, Integer blkRank, Integer blkaRank, Integer pfRank, Integer pfdRank, Integer ptsRank, Integer plusMinusRank, Integer nbaFantasyPtsRank, Integer dd2Rank, Integer td3Rank, Integer wnbaFantasyPtsRank, Integer teamCount) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.nickname = nickname;
        this.teamId = teamId;
        this.teamAbbreviation = teamAbbreviation;
        this.age = age;
        this.gp = gp;
        this.w = w;
        this.l = l;
        this.wPct = wPct;
        this.min = min;
        this.fgm = fgm;
        this.fga = fga;
        this.fgPct = fgPct;
        this.fg3m = fg3m;
        this.fg3a = fg3a;
        this.fg3Pct = fg3Pct;
        this.ftm = ftm;
        this.fta = fta;
        this.ftPct = ftPct;
        this.oreb = oreb;
        this.dreb = dreb;
        this.reb = reb;
        this.ast = ast;
        this.tov = tov;
        this.stl = stl;
        this.blk = blk;
        this.blka = blka;
        this.pf = pf;
        this.pfd = pfd;
        this.pts = pts;
        this.plusMinus = plusMinus;
        this.nbaFantasyPts = nbaFantasyPts;
        this.dd2 = dd2;
        this.td3 = td3;
        this.wnbaFantasyPts = wnbaFantasyPts;
        this.gpRank = gpRank;
        this.wRank = wRank;
        this.lRank = lRank;
        this.wPctRank = wPctRank;
        this.minRank = minRank;
        this.fgmRank = fgmRank;
        this.fgaRank = fgaRank;
        this.fgPctRank = fgPctRank;
        this.fg3mRank = fg3mRank;
        this.fg3aRank = fg3aRank;
        this.fg3PctRank = fg3PctRank;
        this.ftmRank = ftmRank;
        this.ftaRank = ftaRank;
        this.ftPctRank = ftPctRank;
        this.orebRank = orebRank;
        this.drebRank = drebRank;
        this.rebRank = rebRank;
        this.astRank = astRank;
        this.tovRank = tovRank;
        this.stlRank = stlRank;
        this.blkRank = blkRank;
        this.blkaRank = blkaRank;
        this.pfRank = pfRank;
        this.pfdRank = pfdRank;
        this.ptsRank = ptsRank;
        this.plusMinusRank = plusMinusRank;
        this.nbaFantasyPtsRank = nbaFantasyPtsRank;
        this.dd2Rank = dd2Rank;
        this.td3Rank = td3Rank;
        this.wnbaFantasyPtsRank = wnbaFantasyPtsRank;
        this.teamCount = teamCount;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamAbbreviation() {
        return teamAbbreviation;
    }

    public void setTeamAbbreviation(String teamAbbreviation) {
        this.teamAbbreviation = teamAbbreviation;
    }

    public Float getAge() {
        return age;
    }

    public void setAge(Float age) {
        this.age = age;
    }

    public Integer getGp() {
        return gp;
    }

    public void setGp(Integer gp) {
        this.gp = gp;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getL() {
        return l;
    }

    public void setL(Integer l) {
        this.l = l;
    }

    public Float getwPct() {
        return wPct;
    }

    public void setwPct(Float wPct) {
        this.wPct = wPct;
    }

    public Float getMin() {
        return min;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public Integer getFgm() {
        return fgm;
    }

    public void setFgm(Integer fgm) {
        this.fgm = fgm;
    }

    public Integer getFga() {
        return fga;
    }

    public void setFga(Integer fga) {
        this.fga = fga;
    }

    public Float getFgPct() {
        return fgPct;
    }

    public void setFgPct(Float fgPct) {
        this.fgPct = fgPct;
    }

    public Integer getFg3m() {
        return fg3m;
    }

    public void setFg3m(Integer fg3m) {
        this.fg3m = fg3m;
    }

    public Integer getFg3a() {
        return fg3a;
    }

    public void setFg3a(Integer fg3a) {
        this.fg3a = fg3a;
    }

    public Float getFg3Pct() {
        return fg3Pct;
    }

    public void setFg3Pct(Float fg3Pct) {
        this.fg3Pct = fg3Pct;
    }

    public Integer getFtm() {
        return ftm;
    }

    public void setFtm(Integer ftm) {
        this.ftm = ftm;
    }

    public Integer getFta() {
        return fta;
    }

    public void setFta(Integer fta) {
        this.fta = fta;
    }

    public Float getFtPct() {
        return ftPct;
    }

    public void setFtPct(Float ftPct) {
        this.ftPct = ftPct;
    }

    public Integer getOreb() {
        return oreb;
    }

    public void setOreb(Integer oreb) {
        this.oreb = oreb;
    }

    public Integer getDreb() {
        return dreb;
    }

    public void setDreb(Integer dreb) {
        this.dreb = dreb;
    }

    public Integer getReb() {
        return reb;
    }

    public void setReb(Integer reb) {
        this.reb = reb;
    }

    public Integer getAst() {
        return ast;
    }

    public void setAst(Integer ast) {
        this.ast = ast;
    }

    public Integer getTov() {
        return tov;
    }

    public void setTov(Integer tov) {
        this.tov = tov;
    }

    public Integer getStl() {
        return stl;
    }

    public void setStl(Integer stl) {
        this.stl = stl;
    }

    public Integer getBlk() {
        return blk;
    }

    public void setBlk(Integer blk) {
        this.blk = blk;
    }

    public Integer getBlka() {
        return blka;
    }

    public void setBlka(Integer blka) {
        this.blka = blka;
    }

    public Integer getPf() {
        return pf;
    }

    public void setPf(Integer pf) {
        this.pf = pf;
    }

    public Integer getPfd() {
        return pfd;
    }

    public void setPfd(Integer pfd) {
        this.pfd = pfd;
    }

    public Integer getPts() {
        return pts;
    }

    public void setPts(Integer pts) {
        this.pts = pts;
    }

    public Integer getPlusMinus() {
        return plusMinus;
    }

    public void setPlusMinus(Integer plusMinus) {
        this.plusMinus = plusMinus;
    }

    public Float getNbaFantasyPts() {
        return nbaFantasyPts;
    }

    public void setNbaFantasyPts(Float nbaFantasyPts) {
        this.nbaFantasyPts = nbaFantasyPts;
    }

    public Integer getDd2() {
        return dd2;
    }

    public void setDd2(Integer dd2) {
        this.dd2 = dd2;
    }

    public Integer getTd3() {
        return td3;
    }

    public void setTd3(Integer td3) {
        this.td3 = td3;
    }

    public Float getWnbaFantasyPts() {
        return wnbaFantasyPts;
    }

    public void setWnbaFantasyPts(Float wnbaFantasyPts) {
        this.wnbaFantasyPts = wnbaFantasyPts;
    }

    public Integer getGpRank() {
        return gpRank;
    }

    public void setGpRank(Integer gpRank) {
        this.gpRank = gpRank;
    }

    public Integer getwRank() {
        return wRank;
    }

    public void setwRank(Integer wRank) {
        this.wRank = wRank;
    }

    public Integer getlRank() {
        return lRank;
    }

    public void setlRank(Integer lRank) {
        this.lRank = lRank;
    }

    public Integer getwPctRank() {
        return wPctRank;
    }

    public void setwPctRank(Integer wPctRank) {
        this.wPctRank = wPctRank;
    }

    public Integer getMinRank() {
        return minRank;
    }

    public void setMinRank(Integer minRank) {
        this.minRank = minRank;
    }

    public Integer getFgmRank() {
        return fgmRank;
    }

    public void setFgmRank(Integer fgmRank) {
        this.fgmRank = fgmRank;
    }

    public Integer getFgaRank() {
        return fgaRank;
    }

    public void setFgaRank(Integer fgaRank) {
        this.fgaRank = fgaRank;
    }

    public Integer getFgPctRank() {
        return fgPctRank;
    }

    public void setFgPctRank(Integer fgPctRank) {
        this.fgPctRank = fgPctRank;
    }

    public Integer getFg3mRank() {
        return fg3mRank;
    }

    public void setFg3mRank(Integer fg3mRank) {
        this.fg3mRank = fg3mRank;
    }

    public Integer getFg3aRank() {
        return fg3aRank;
    }

    public void setFg3aRank(Integer fg3aRank) {
        this.fg3aRank = fg3aRank;
    }

    public Integer getFg3PctRank() {
        return fg3PctRank;
    }

    public void setFg3PctRank(Integer fg3PctRank) {
        this.fg3PctRank = fg3PctRank;
    }

    public Integer getFtmRank() {
        return ftmRank;
    }

    public void setFtmRank(Integer ftmRank) {
        this.ftmRank = ftmRank;
    }

    public Integer getFtaRank() {
        return ftaRank;
    }

    public void setFtaRank(Integer ftaRank) {
        this.ftaRank = ftaRank;
    }

    public Integer getFtPctRank() {
        return ftPctRank;
    }

    public void setFtPctRank(Integer ftPctRank) {
        this.ftPctRank = ftPctRank;
    }

    public Integer getOrebRank() {
        return orebRank;
    }

    public void setOrebRank(Integer orebRank) {
        this.orebRank = orebRank;
    }

    public Integer getDrebRank() {
        return drebRank;
    }

    public void setDrebRank(Integer drebRank) {
        this.drebRank = drebRank;
    }

    public Integer getRebRank() {
        return rebRank;
    }

    public void setRebRank(Integer rebRank) {
        this.rebRank = rebRank;
    }

    public Integer getAstRank() {
        return astRank;
    }

    public void setAstRank(Integer astRank) {
        this.astRank = astRank;
    }

    public Integer getTovRank() {
        return tovRank;
    }

    public void setTovRank(Integer tovRank) {
        this.tovRank = tovRank;
    }

    public Integer getStlRank() {
        return stlRank;
    }

    public void setStlRank(Integer stlRank) {
        this.stlRank = stlRank;
    }

    public Integer getBlkRank() {
        return blkRank;
    }

    public void setBlkRank(Integer blkRank) {
        this.blkRank = blkRank;
    }

    public Integer getBlkaRank() {
        return blkaRank;
    }

    public void setBlkaRank(Integer blkaRank) {
        this.blkaRank = blkaRank;
    }

    public Integer getPfRank() {
        return pfRank;
    }

    public void setPfRank(Integer pfRank) {
        this.pfRank = pfRank;
    }

    public Integer getPfdRank() {
        return pfdRank;
    }

    public void setPfdRank(Integer pfdRank) {
        this.pfdRank = pfdRank;
    }

    public Integer getPtsRank() {
        return ptsRank;
    }

    public void setPtsRank(Integer ptsRank) {
        this.ptsRank = ptsRank;
    }

    public Integer getPlusMinusRank() {
        return plusMinusRank;
    }

    public void setPlusMinusRank(Integer plusMinusRank) {
        this.plusMinusRank = plusMinusRank;
    }

    public Integer getNbaFantasyPtsRank() {
        return nbaFantasyPtsRank;
    }

    public void setNbaFantasyPtsRank(Integer nbaFantasyPtsRank) {
        this.nbaFantasyPtsRank = nbaFantasyPtsRank;
    }

    public Integer getDd2Rank() {
        return dd2Rank;
    }

    public void setDd2Rank(Integer dd2Rank) {
        this.dd2Rank = dd2Rank;
    }

    public Integer getTd3Rank() {
        return td3Rank;
    }

    public void setTd3Rank(Integer td3Rank) {
        this.td3Rank = td3Rank;
    }

    public Integer getWnbaFantasyPtsRank() {
        return wnbaFantasyPtsRank;
    }

    public void setWnbaFantasyPtsRank(Integer wnbaFantasyPtsRank) {
        this.wnbaFantasyPtsRank = wnbaFantasyPtsRank;
    }

    public Integer getTeamCount() {
        return teamCount;
    }

    public void setTeamCount(Integer teamCount) {
        this.teamCount = teamCount;
    }
}

