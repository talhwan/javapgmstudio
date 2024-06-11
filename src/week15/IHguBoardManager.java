package week15;

import week12.TodoItem;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public interface IHguBoardManager {
    public void addUser(HguUser each);
    public String addBoard(HguBoard each);
    public String addCmt(HguCmt each);
}