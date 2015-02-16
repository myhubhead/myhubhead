package com.sprhib.dao;

import java.util.List;

import com.sprhib.model.Team;

public interface TeamDAO {
	
	//first update methods ...
	//second update...
	//third update...
	//4th update
	public void addTeam(Team team);
	public void updateTeam(Team team);
	public Team getTeam(int id);
	public void deleteTeam(int id);
	public List<Team> getTeams();

}
