
import { Provider } from 'react-redux'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import './App.css'
import store from './app/store';
import Dashboard from './pages/dashboard';

function App() {
  

  return (
    <Provider store={store}>
     <Router>
        <Routes>
          <Route path="/" element={<Dashboard />} />
        </Routes>
      </Router>
    </Provider>
  )
}

export default App
