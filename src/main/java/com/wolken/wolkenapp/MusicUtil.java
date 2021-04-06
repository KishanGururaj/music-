package com.wolken.wolkenapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.bean.MusicBean;

public class MusicUtil {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context.xml");
		MusicBean bean=applicationContext.getBean(MusicBean.class);
		System.out.println("Song Name: "+bean.getSongName());
		System.out.println("Song type: "+bean.getType());
		System.out.println("Song Artist: "+bean.getArtistName());
		System.out.println("Song Year: "+bean.getReleaseYear());
	}

}
