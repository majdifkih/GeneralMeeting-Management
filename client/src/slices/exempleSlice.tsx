import { createSlice } from "@reduxjs/toolkit";


interface Todo {
    id: number;
    text: string;
    completed: boolean;
  }
  
 
  type TodoState = Todo[];
   
  const initialState: TodoState = [];

const exempleSlice = createSlice({
  name: "exemple",
  initialState,
  reducers: {
    addTodo: (state, action) => {
      const newTodo = {
        id: Date.now(),
        text: action.payload,
        completed: false,
      };
      state.push(newTodo);
    },
    
  },
});
export const { addTodo} = exempleSlice.actions;
export default exempleSlice.reducer;